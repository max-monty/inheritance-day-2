public class Character {
    private String name;
    private int health;
    
    public Character() {
        System.out.println("Character no-arg constructor");
        this.name = "Unknown";
        this.health = 100;
    }
    
    public Character(String name, int health) {
        System.out.println("Character parameterized constructor");
        this.name = name;
        this.health = health;
    }
    
    public void move() {
        System.out.println(name + " moves.");
    }
    
    public String getName() { return name; }
    public int getHealth() { return health; }
}