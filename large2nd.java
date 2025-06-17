public class large2nd {
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int max = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++) {
               if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }

        System.out.println("2nd Maximum element: " + max2); 
    }
}
