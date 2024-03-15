public class Main {
    public static void main(String[] args) {
        Quicksort quicksort = new Quicksort();

        int[] list = {1, 8, 2, 3, 4, 0, -1, 7, 9, 2, 75989769};


        System.out.println("Before sorting");
        for(int element: list){
            System.out.print(element + "\t");
        }

        System.out.println();

        quicksort.sort(list);

        System.out.println("After sorting");
        for(int element: list){
            System.out.print(element + "\t");
        }
    }
}
