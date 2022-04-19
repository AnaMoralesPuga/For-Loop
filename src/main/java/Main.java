import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //input: [1, 2, 3, 4, 5]
        //output: [5, 4, 3, 2, 1]
        int[] array = {1, 2, 3, 4, 5};
        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted [i] = array[array.length - i -1];
        }
        System.out.println(Arrays.toString(inverted));
    }}






