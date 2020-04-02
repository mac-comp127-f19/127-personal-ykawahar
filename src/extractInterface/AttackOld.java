package extractInterface;

import java.util.Random;

public class AttackOld {
    private static final Random rand = new Random();

    private final int swordMinDamage, swordMaxDamage;
    private final int fireballDamage;
    private final int fireballManaRequired;

    public AttackOld(int hitPoints, int mana, int swordMinDamage, int swordMaxDamage, int fireballDamage, int fireballManaRequired) {
        if ((swordMinDamage != 0 || swordMaxDamage != 0) && (fireballDamage != 0 || fireballManaRequired != 0)) {
            throw new IllegalArgumentException("Character cannot have both sword and fireball damage");
        }

        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public String attack(GameCharacter user, GameCharacter target) {
        if (fireballDamage > 0) {
            if (user.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return user.getName() + " hit " + target.getName() + " with a fireball for "
                        + fireballDamage + " points of damage";
            } else {
                return user.getName() + " did not have enough mana for a fireball attack";
            }
        } else {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return user.getName() + " struck " + target.getName() + " with a sword for "
                    + damage + " points of damage";
        }
    }
}
