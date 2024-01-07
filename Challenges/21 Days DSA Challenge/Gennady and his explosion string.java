import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String explosiveString = sc.next();

        while (str.length() > 0) {
            int index = str.indexOf(explosiveString);
            if (index == -1) {
                System.out.println(str);
                return;
            }
            str = str.substring(0, index) + str.substring(index + explosiveString.length());
        }
        System.out.println("FRULA");
    }
}