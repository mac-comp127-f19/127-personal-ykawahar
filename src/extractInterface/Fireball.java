package extractInterface;

import java.util.Random;

public class Fireball implements Attack {

    private final int fireballDamage;
    private final int fireballManaRequired;

    public Fireball(int fireballDamage, int fireballManaRequired) {
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public String attack(GameCharacter user, GameCharacter target) {
         if (user.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return user.getName() + " hit " + target.getName() + " with a fireball for "
                        + fireballDamage + " points of damage";
            } else {
                return user.getName() + " did not have enough mana for a fireball attack";
            }
    }
}
