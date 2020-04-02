package extractInterface;

import java.util.Random;

public class Sword implements Attack {

    private static final Random rand = new Random();

    private final int swordMinDamage, swordMaxDamage;

    public Sword(int swordMinDamage, int swordMaxDamage) {
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
    }

    public String attack(GameCharacter user, GameCharacter target) {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return user.getName() + " struck " + target.getName() + " with a sword for "
                    + damage + " points of damage";
    }

}
