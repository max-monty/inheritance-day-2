public class OverrideDemo {
    public static void main(String[] args) {
        System.out.println("*** Creating characters ***\n");
        Character c = new Character("Generic", 50);
        Warrior w = new Warrior("Conan", 120, 18);
        Wizard wiz = new Wizard("Gandalf", 90, 100);
        
        System.out.println("\n*** Testing movement ***\n");
        c.move();   // Character's version
        w.move();   // Warrior's version
        wiz.move(); // Wizard's version
        
        // Demonstrate runtime binding
        System.out.println("\n*** Demonstrating polymorphism ***\n");
        Character polyChar = new Warrior("PolyWarrior", 100, 15);
        polyChar.move();  // Which move() gets called?
        
        // Error case - try to call specific subclass method through superclass reference
        // polyChar.attack();  // Won't compile!
    }
}