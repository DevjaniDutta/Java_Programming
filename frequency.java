import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        String S = "Java Programming";
        S = S.replaceAll("\\s", "").toLowerCase();
        char[] C = S.toCharArray();
        Arrays.sort(C);
        int count = 1;

        for (int i = 0; i < C.length - 1; i++) {
            if (C[i] == C[i + 1]) {
                count++;
            } else {
                System.out.println(C[i] + " : " + count);
                count = 1; 
            }
        }
        System.out.println(C[C.length - 1] + " : " + count);
    }
}

    

