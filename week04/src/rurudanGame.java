import java.util.Scanner;

public class rurudanGame {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int dan = scanner.nextInt();

        for (int i=1; i<10; i++) {
            System.out.println(dan + " x " + i + " = " + (dan*i));
        }
    }
}
