public class Selection {
    public static int[] sort(int[] array) {
        int marker = 0;
        while (marker < array.length) {
            for (int i = marker; i < array.length; i++){
                if(array[marker] > array[i]) {
                    int temp = array[marker];
                    array[marker] = array[i];
                    array[i] = temp;
                }
            }
            marker +=1;
        }
      return array;
    }
}
