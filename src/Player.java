import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player extends GameEntity {
    private int weaponDamage;
    private int amour;
    }
    public class player {
        File armory = new File("/Users/yarieltunon/Desktop/GoogleDrive/Junioryear/comp2.rtf");
        Scanner scan = new Scanner(System.in);

        public String[] split​(String weaponDamage, int limit) {
            int count = 0;
            limit = 5;
            for (int i = 0; i <= count; count++) {
                System.out.println(armory);
                return split​(weaponDamage,5);
            }
        }
        public player() throws FileNotFoundException {
            System.out.println(armory);
        }



        public void swapWeapon() {
        }

        public void changeArmour(int newArmourValue) {
            var armour = newArmourValue;

        }

        public int getArmour(int armour) {
            return armour;
        }

        public int attack(BadGuy enemy) {
            BadGuy = takeDamage(50) - enemy;
        }

    }


}

//