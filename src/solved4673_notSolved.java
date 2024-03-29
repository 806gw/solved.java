import java.util.Scanner;

public class solved4673_notSolved {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = in.nextInt(); //a 값 만큼 배열에 차례대로 넣기
        }

        // 입력된 배열의 역순으로 출력
        for (int i = a - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
