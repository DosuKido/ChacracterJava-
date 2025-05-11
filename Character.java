import java.io.Serializable;
public class Character implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int score;
    private int level;
    private int health;
    private int attackPower;
    private int defense;
    private transient int hiddenAttribute;
    public Character(String name, int score, int level, int health, int attackPower, int defense, int hiddenAttribute) {
        this.name = name;
        this.score = score;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.hiddenAttribute = hiddenAttribute;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Character{name='" + name + "', score=" + score + ", level=" + level + 
               ", health=" + health + ", attackPower=" + attackPower + ", defense=" + defense + 
               ", hiddenAttribute=" + hiddenAttribute + "}";
    }
}
