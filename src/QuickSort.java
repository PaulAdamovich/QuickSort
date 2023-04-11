import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {234, 1,657,64,123,4,-122,3544,6,687};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int [] array, int from, int to) {
        if (from < to) {
            int divideIndex = partition(array, from, to);
            quickSort(array, from, divideIndex - 1);
            quickSort(array, divideIndex, to);
        }
    }

    private static int partition(int[] array, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = array[from + (to - from)/2];
        while(leftIndex <= rightIndex){
            while(array[leftIndex] < pivot){
                leftIndex++;
            }
            while(array[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap(array , leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1]=array[index2];
        array[index2]=tmp;
    }
}
