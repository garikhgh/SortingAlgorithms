import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {1, 5, 3,20, 5, 7, 6, 10, 9, 1, 0};

        int[] bubbleSort = Bubble.sort(arr);
        System.out.println(Arrays.toString(bubbleSort));

        int[] selectionSort = Selection.sort(arr);
        System.out.println(Arrays.toString(selectionSort));
    }
}