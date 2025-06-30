public class Avrora extends Hero {
    private boolean hasUsedInvisibility = false;
    private int storedDamage = 0;

    public Avrora(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        if (!hasUsedInvisibility) {
            System.out.println("Avrora activates invisibility for 2 rounds!");
            hasUsedInvisibility = true;

        } else {
            System.out.println("Avrora has already used her invisibility!");
        }
    }


    public void storeDamage(int damage) {
        this.storedDamage += damage;
        System.out.println("Avrora stores " + damage + " damage to return later");
    }


    public void returnDamage() {
        if (storedDamage > 0) {
            System.out.println("Avrora returns " + storedDamage + " stored damage to boss!");

            storedDamage = 0;
        }
    }
}