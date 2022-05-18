import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Integer[] an = new Integer[]{20,10,2,1,3,4,5,23,21,5,2,4,5,10,3};

        Integer[] n = Sorts.BubbleSort(an);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
