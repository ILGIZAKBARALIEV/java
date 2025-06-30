import java.util.Random;

public class Druid extends Hero {
    private boolean hasSummoned = false;
    private Random random = new Random();

    public Druid(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        if (!hasSummoned) {
            int choice = random.nextInt(2); // 0 or 1
            if (choice == 0) {
                System.out.println("Druid summons an Angel to help the Medic!");

            } else {
                System.out.println("Druid summons a Crow to help the Boss!");

            }
            hasSummoned = true;
        } else {
            System.out.println("Druid has already used his summoning ability!");
        }
    }
}