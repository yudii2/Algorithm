public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(a + b); // A+B
        System.out.println(a - b); // A-B
        System.out.println(a * b); // A*B
        System.out.println(a / b); // A/B (몫)
        System.out.println(a % b); // A%B (나머지)
    }
}
