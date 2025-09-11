import java.util.Scanner;

public class prime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc.nextInt();

        for (int i=1; i<number; i++) {
            if (number % i == 0) {
                counter++; // counter = counter + 1
                break;
            }
        }

        if (counter == 0) {
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " is not prime number, (" + counter + ")");
        }
    }
}
