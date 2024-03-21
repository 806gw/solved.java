import java.util.Scanner;

public class solved2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner 객체 생성하여 입력을 받기 위한 준비
        int[] a = {
                in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()
        }; // 9개의 정수를 입력받아 배열에 저장

        in.close(); // Scanner 사용이 끝났으므로 닫아줌

        int count = 0; // 카운트 변수 초기화
        int max = 0; // 최댓값 변수 초기화
        int index = 0; // 최댓값이 있는 인덱스 초기화

        for(int value : a) { // 배열 a의 각 요소에 대해서 반복
            count++; // 인덱스를 1씩 증가

            if(value > max) { // 만약 현재 값이 최댓값보다 크다면
                max = value; // 최댓값을 현재 값으로 업데이트
                index = count; // 최댓값이 있는 위치를 업데이트
            }
        }

        System.out.print(max + "\n" + index); // 최댓값과 그 위치를 출력
    }
}
