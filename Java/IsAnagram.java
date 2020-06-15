import java.util.Scanner;

class IsAnagram {
        private static int CHARACTER_RANGE= 256;

        static boolean isAnagram(String a, String b) {
                a = a.toLowerCase();
                b = b.toLowerCase();
                if (a.length() != b.length()) {
                        return false;
                }

                int count[] = new int[CHARACTER_RANGE];
                for (int i = 0; i < a.length(); i++) {
                        count[a.charAt(i)]++;
                        count[b.charAt(i)]--;
                }
                for (int i = 0; i < CHARACTER_RANGE; i++) {
                        if (count[i] != 0)
                                return false;
                }
                return true;
        }

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String a = scan.next();
                String b = scan.next();
                scan.close();
                boolean ret = isAnagram(a, b);
                System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
}
