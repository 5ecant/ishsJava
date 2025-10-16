public class GameDemo {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(100);
        Pikachu yourPikachu = new Pikachu(100);
        System.out.println("Game Start");
        yourPikachu.attack(pikachu);
    }
}