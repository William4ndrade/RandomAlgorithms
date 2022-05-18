public class util {

    public static <T> void SwapElementsBubbleSort(int index, T[] arr){
        T current = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = current;

    }

}
