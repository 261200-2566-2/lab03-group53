public class RPGCharacter {
    private int level;
    private int maxHP;
    private int maxMana;
    private int swordBaseDamage;
    private int shieldBaseDefense;
    private int baseRunSpeed;
    private int currentRunSpeed;
    private Sword equippedSword;
    private Shield equippedShield;

    public RPGCharacter(int level){
        this.level = level;
        levelUp();
    }
    public void equipSword(Sword sword) {
        this.equippedSword = sword;
        updateCharacterStats();
    }
    public void equipShield(Shield shield) {
        this.equippedShield = shield;
        updateCharacterStats();
    }
    private void updateCharacterStats() {
        if (equippedSword != null) {
            currentRunSpeed -= equippedSword.getRunSpeedDecrease();
        }

        if (equippedShield != null) {
            currentRunSpeed -= equippedShield.getRunSpeedDecrease();
        }
    }
    public void levelUp(){
        maxHP = 100 + 10 * level;
        maxMana = 50 + 2 * level;
        baseRunSpeed = 10;
        currentRunSpeed = (int) (baseRunSpeed * (0.1 + 0.03 * level));
    }
    public void display(){
        System.out.println("Max HP : " + maxHP);
        System.out.println("Max Mana : " + maxMana);
        System.out.println("Max Run Speed : " + currentRunSpeed);
    }
}

