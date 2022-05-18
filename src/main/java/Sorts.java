import java.util.ArrayList;
import java.util.List;

public class Sorts {

    public static <T extends Comparable<? super T>> T[] BubbleSort(T[] arr){
        for(int x= arr.length; x>1;x--){
            for(int y= 0; y<x-1;y++ ){
                if(arr[y].compareTo(arr[y+1]) > 0){
                    util.SwapElementsBubbleSort(y, arr);
                }
            }
        }
        return arr;
    }




    public static <T extends Comparable<? super T>> T[] SelectionSort(T[] arr){

    }






}
