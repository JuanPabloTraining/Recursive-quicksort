import java.util.List;
import java.util.Random;

public class Quicksort {
    public void sort(int[] list) {
        sort(list, 0, list.length-1);
    }

    public void sort(int[] list, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int pivotIndex = getPivotIndex(leftIndex, rightIndex);
            swap(list, pivotIndex, rightIndex);

            pivotIndex = partitionPivot(list, leftIndex, rightIndex, list[rightIndex], true);
            swap(list, pivotIndex, rightIndex);

            sort(list, leftIndex, pivotIndex - 1);
            sort(list, pivotIndex + 1, rightIndex);
        }
    }

    private int partitionPivot(int[] list,
                               int leftIndex,
                               int rightIndex,
                               int pivot,
                               boolean canMoveLeftIndex
    ) {
        if (leftIndex >= rightIndex) {
            return rightIndex;
        }

        if (list[leftIndex] >= pivot && canMoveLeftIndex) {
            return partitionPivot(list,
                                  leftIndex,
                                  rightIndex-1,
                                  pivot,
                                  false);
        }

        if (list[rightIndex] < pivot && !canMoveLeftIndex) {
            swap(list, rightIndex, leftIndex);
            return partitionPivot(list,
                                  leftIndex+1,
                                  rightIndex,
                                  pivot,
                                  true);
        }

        int leftIndexIncrement = (canMoveLeftIndex) ? 1 : 0;
        int rightIndexIncrement = (canMoveLeftIndex) ? 0 : -1;
        return partitionPivot(list,
                              leftIndex + leftIndexIncrement,
                              rightIndex + rightIndexIncrement,
                              pivot,
                              canMoveLeftIndex);
    }

    private void swap(int[] list, int leftIndex, int rightIndex) {
        if (rightIndex != leftIndex) {
            int number1 = list[rightIndex];
            list[rightIndex] = list[leftIndex];
            list[leftIndex] = number1;
        }
    }

    private int getPivotIndex(int leftIndex, int rightIndex) {
        Random rand = new Random();
        return rand.nextInt(rightIndex - leftIndex) + leftIndex;
    }
}
