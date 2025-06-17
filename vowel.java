public class vowel {
    public static void main(String[] args) {
        String S ="Hello";
        int V =0 ,C = 0;
        for (int i =0 ; i <= S.length() -1;i ++){
            char x = S.charAt(i);
        if (x == 'a' || x == 'e' || x == 'i' ||
            x == 'o' || x == 'u' || x == 'A' ||
            x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            V++;
            } else if (Character.isLetter(x)) { 
                C++;
            }
        }

        System.out.println("Vowels: " + V);
        System.out.println("Consonants: " + C);
    }


    }
    

