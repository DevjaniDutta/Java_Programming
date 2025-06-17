import java.util.Arrays;

public class RevArray {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int[] revA = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revA[j] = arr[i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(revA));
    }   
    
}
