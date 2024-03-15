import java.util.List;
import java.util.Random;

public class Quicksort {
    public void sort(int[] list) {
        sort(list, 0, list.length-1);
    }

    public void sort(int[] list, int li, int ri) {
        if (ri > li) {
            int pivotIndex = getPivotIndex(li, ri);
            swap(list, pivotIndex, ri);

            pivotIndex = orderedSwap(list, li, ri, list[ri], true);
            swap(list, pivotIndex, ri);

            sort(list, li, pivotIndex - 1);
            sort(list, pivotIndex + 1, ri);
        }
    }

    private int orderedSwap(int[] list, int li, int ri, int pivot, boolean canMoveLeftIndex) {

        if (li >= ri) {
            return ri;
        }

        if (list[li] >= pivot && canMoveLeftIndex) {
            return orderedSwap(list, li, ri-1, pivot, false);
        }

        if (list[ri] < pivot && !canMoveLeftIndex) {
            swap(list, ri, li);
            return orderedSwap(list, li+1, ri, pivot, true);
        }

        int liIncrement = (canMoveLeftIndex) ? 1 : 0;
        int riIncrement = (canMoveLeftIndex) ? 0 : -1;
        return orderedSwap(list, li + liIncrement, ri + riIncrement, pivot, canMoveLeftIndex);
    }

    private void swap(int[] list, int index1, int index2) {
        if (index1 != index2) {
            int number1 = list[index1];
            list[index1] = list[index2];
            list[index2] = number1;
        }
    }

    private int getPivotIndex(int li, int ri) {
        Random rand = new Random();
        return rand.nextInt(ri - li) + li;
    }

    private void printList(int[] list) {
        for (int element: list) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }
}
