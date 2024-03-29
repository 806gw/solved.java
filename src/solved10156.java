import java.util.Scanner;

public class solved10156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt(); //과자 한개 가격
        int N = in.nextInt(); //과자 개수
        int M = in.nextInt(); //가진 돈
        if (M >= K * N) {
            System.out.println("0");
        }
        else {
            System.out.println((K * N) - M);
        }
    }
}
