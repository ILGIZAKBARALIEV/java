public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType); // Вызов конструктора родительского класса Hero
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        this.healPoints *= 1.10;
        System.out.println("Medic's heal points increased to " + this.healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность " + getSuperAbilityType());
    }
}
