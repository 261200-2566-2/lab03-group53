public class Sword {
    private int level;
    private int baseDamage;

    public Sword(int level, int baseDamage) {
        this.level = level;
        this.baseDamage = baseDamage;
    }
    public int calculateDamage() {
        return (int) (baseDamage * (1 + 0.1 * level));
    }
    public int getRunSpeedDecrease() {
        return (int) (10 * (0.1 + 0.04 * level));
    }
    public void display(){
        System.out.println("SwordDamage : " + calculateDamage());
    }

}