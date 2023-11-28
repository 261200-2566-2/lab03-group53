import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Level : ");
        int level = input.nextInt();
        System.out.print("Input Your SwordLevel : ");
        int Swordlevel = input.nextInt();
        System.out.print("Input your SwordDamge : ");
        int damage = input.nextInt();
        System.out.print("Input Your ShieldLevel : ");
        int Shieldlevel = input.nextInt();
        System.out.print("Input your ShieldDefense : ");
        int defense = input.nextInt();

        RPGCharacter C = new RPGCharacter(level);
        Sword S = new Sword(Swordlevel,damage);
        Shield Shi = new Shield(Shieldlevel,defense);

        System.out.println("****************************************************************************************************************************************");
        System.out.println("Your RPGCharacter");
        C.display();
        S.display();
        Shi.display();
    }
}