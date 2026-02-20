import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();

            // %-15s  → left-justified string, width 15
            // %03d    → integer, width 3, pad with 0
            System.out.printf("%-15s%03d%n", s, x);
        }

        System.out.println("================================");

        sc.close();
    }
}
