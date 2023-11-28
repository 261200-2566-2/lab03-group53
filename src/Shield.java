public class Shield {
    private int level;
    private int baseDefense;
    public Shield(int level, int baseDefense) {
        this.level = level;
        this.baseDefense = baseDefense;
    }

    public int calculateDefense() {
        return (int) (baseDefense * (1 + 0.05 * level));
    }

    public int getRunSpeedDecrease() {
        return (int) (10 * (0.1 + 0.08 * level));
    }
    public void display(){
        System.out.println("ShieldDefense : " + calculateDefense());
    }
}