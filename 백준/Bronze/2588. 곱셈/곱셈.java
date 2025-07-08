public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        scanner.close();

        System.out.println(a * get_1(b));
        System.out.println(a * get_10(b));
        System.out.println(a * get_100(b));

        System.out.println(a * b);
    }


    public static int get_1(int b) {
        return b % 10;
    }

    public static int get_10(int b) {
        return (b / 10) % 10;
    }

    public static int get_100(int b) {
        return b / 100;
    }
}
