public class Wizard extends Character {
    private int mana;
    
    public Wizard(String name, int health, int mana) {
        super(name, health);
        System.out.println("Wizard constructor");
        this.mana = mana;
    }
    
    // Override the move method
    @Override
    public void move() {
        System.out.println(getName() + " floats mysteriously.");
    }
    
    // Additional method specific to Wizard
    public void castSpell() {
        System.out.println(getName() + " casts a spell using " + mana + " mana points!");
    }
}