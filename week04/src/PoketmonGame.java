import java.util.Scanner;

class Poketmon {
    int hp;
}

public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikacu = new Poketmon();

        Scanner scanner = new Scanner(System.in);
        System.out.print("체력을 입력: ");
        pikacu.hp = scanner.nextInt();

        Poketmon ggo = new Poketmon();
        ggo.hp = 100;
        System.out.println(pikacu.hp);

        if (pikacu.hp > 100) {
            System.out.println("조직력이 낮습니다!");
        }else{
            System.out.println("ㅁㄴㅇㄹ");
        }
    }
}
