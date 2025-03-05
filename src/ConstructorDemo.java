public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("*** Creating default Warrior ***\n");
        Warrior w1 = new Warrior();
        System.out.println();
        
        System.out.println("*** Creating custom Warrior ***\n");
        Warrior w2 = new Warrior("Aragorn", 120, 18);
    }
}