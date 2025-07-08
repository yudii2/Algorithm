import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String id = scanner.next();
        scanner.close();

        if (id.isEmpty()) {
            throw new IllegalArgumentException("아이디는 비어 있을 수 없습니다.");
        }
        if (id.length() > 50) {
            throw new IllegalArgumentException("아이디는 50자를 넘을 수 없습니다.");
        }
        if (id.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("아이디는 알파벳 소문자로만 이루어져야 합니다.");
        }

        System.out.println(id + "??!"); 
    }
}