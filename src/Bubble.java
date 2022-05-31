public class Bubble {
    public static int[] sort(int[] array) {
        int n = array.length;
        boolean swapped = true;
        while (swapped)  {
            swapped = false;
            for(int i = 0; i < n - 1; i++){
                if(array[i] >  array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }
}
