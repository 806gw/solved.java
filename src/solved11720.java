import java.util.Scanner;

public class solved11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String c = in.next();
        in.close();

        int num = 0;

        for(int i = 0; i < a; i++) {
             num += c.charAt(i)-'0';
        }
        System.out.print(num);
    }
}
