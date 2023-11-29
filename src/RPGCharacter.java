public class RPGCharacter {
    private int Hp;
    private int Mana;
    private double Damage;
    private double baseSpeed;
    private double maxRunSpeed;
    private int Level;
    private double BaseDefense;
    private double SwordDamage;

    public RPGCharacter(int level,int BaseDamage,int BaseSpeed){
        this.Level = level;
        this.Hp = 100+10*this.Level;
        this.Mana = 50+2*this.Level;
        this.Damage = BaseDamage;
        this.baseSpeed = BaseSpeed;
        this.maxRunSpeed = baseSpeed*(0.1+0.03*this.Level) ;
    }
    public void usingSword(Sword Sword,int SwordDamage){
        this.SwordDamage = SwordDamage*(1+0.1*Sword.SwordLevel);
        this.maxRunSpeed = this.maxRunSpeed*(0.1+0.04*Sword.SwordLevel);
    }
    public void usingShield(Shield Shield,int baseDefense){
        this.BaseDefense = baseDefense*(1+0.1*Shield.Shieldlevel);
        this.maxRunSpeed = this.maxRunSpeed*(0.1+0.04*Shield.Shieldlevel);
    }
    public void display(){
        System.out.println("------------------------------");
        System.out.println("HP: "+ this.Hp);
        System.out.println("Mana: "+ this.Mana);
        System.out.println("Damage: "+ this.Damage);
        System.out.println("speed: "+ this.maxRunSpeed);
        System.out.println("Sword: "+this.SwordDamage);
        System.out.println("Defense: "+ this.BaseDefense);
        System.out.println("------------------------------");
    }
}