import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        scanner.close();

        System.out.println(convertBuddhistToGregorian(number));
    }
    /**
     * 2541년은 불기 2544년이다.
     * 불기 연도를 서기 연도로 변환하는 공식은 다음과 같다:
     * 서기 연도 = 불기 연도 - 543
     *
     * @param buddhistYear 불기 연도
     * @return 서기 연도
     */
    public static int convertBuddhistToGregorian(int buddhistYear) {
        if (buddhistYear < 1000 || buddhistYear > 3000) {
            throw new IllegalArgumentException("불기 연도는 1000 이상 3000 이하이어야 합니다.");
        }
        return buddhistYear - 543;
    }
}