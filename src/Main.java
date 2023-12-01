import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Level : ");
        int level = input.nextInt();
        System.out.print("Input Your BaseDamage : ");
        int BaseDamage = input.nextInt();
        System.out.print("Input Your BaseRunSpeed : ");
        int BaseSpeed = input.nextInt();
        System.out.println("Do you have a sword or not? If not, enter 0.");
        System.out.print("Input Your SwordLevel : ");
        int Swordlevel = input.nextInt();
        System.out.print("Input your SwordDamge : ");
        int damage = input.nextInt();
        System.out.println("Do you have a Shield or not? If not, enter 0.");
        System.out.print("Input Your ShieldLevel : ");
        int ShieldLevel = input.nextInt();
        System.out.print("Input Your ShieldDefense : ");
        int Defense = input.nextInt();
        RPGCharacter C = new RPGCharacter(level,BaseDamage,BaseSpeed);
        Sword S = new Sword(Swordlevel);
        Shield Shi = new Shield(ShieldLevel);

        System.out.println("------------------------------");
        System.out.println("Your RPGCharacter");
        C.usingSword(S,damage);
        C.usingShield(Shi,Defense);
        C.display();
    }
}