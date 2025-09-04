import java.util.Scanner;

public class rurudanGame {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int dan = scanner.nextInt();

        if (dan < 2 || dan > 9) {
            System.out.println("범위를 벗어났습니다.");
        }else{
            for (int i=1; i<10; i++) {
                System.out.println(dan + " x " + i + " = " + (dan*i));
            }
        }
    }
}
