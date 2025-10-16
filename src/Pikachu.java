public class Pikachu extends Poketmon{
    public Pikachu(int hp) {
        super("피카츄", hp);
        System.out.println("피카피카");
    }

    @Override
    public void attack(Poketmon target) {
        // System.out.println(getName() + " -> " + target.getName()); // name is private
        System.out.println(name + " -> " + target.getName() + "에게 전기충격 사용"); // name is protected
    }
}