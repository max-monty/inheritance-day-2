public class Warrior extends Character {
    private int strength;
    
    // No-arg constructor with implicit super() call
    public Warrior() {
        // Implicit super() happens here
        System.out.println("Warrior no-arg constructor");
        strength = 15;
    }
    
    // Parameterized constructor with explicit super call
    public Warrior(String name, int health, int strength) {
        super(name, health); // Must be first line!
        System.out.println("Warrior parameterized constructor");
        this.strength = strength;
    }
    
    public int getStrength() { return strength; }

    @Override // this is just a comment to say that this method is overriding the method in the superclass
    public void move() {
        System.out.println(getName() + " marches boldly.");
    }
    
    // Additional method specific to Warrior
    public void attack() {
        System.out.println(getName() + " attacks with " + strength + " strength points!");
    }
}

