import java.util.Random;

public class HomeWork4 {
    public static int bossHealth = 1000;
    public static int bossDamage = 50;
    public static String bossDefence;
    public static boolean bossStunned = false;
    public static boolean witcherUsed = false;

    public static int[] heroesHealth = {290, 270, 250, 250, 500, 270, 280, 260};
    public static int[] heroesDamage = {20, 15, 10, 0, 5, 15, 0, 20};
    public static String[] heroesAttackType = {
            "Physical", "Magical", "Kinetic", "Medic", "Golem", "Lucky", "Witcher", "Thor"
    };

    public static int roundNumber;

    public static void main(String[] args) {
        printStatistics();

        while (!isGameOver()) {
            playRound();
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int health : heroesHealth) {
            if (health > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        thorStun();
        bossAttack();
        medicHeal();
        heroesAttack();
        printStatistics();
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(3); // только атакующие типы
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void bossAttack() {
        if (bossStunned) {
            System.out.println("Boss is stunned and skips the round!");
            bossStunned = false;
            return;
        }
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                if (heroesAttackType[i].equals("Lucky")) {
                    if (new Random().nextInt(100) < 25) {
                        System.out.println("Lucky dodged the attack!");
                        continue;
                    }
                }
                int damage = bossDamage;
                if (!heroesAttackType[i].equals("Golem")) {
                    damage -= bossDamage / 5;
                }
                heroesHealth[i] -= damage;
            }
        }
        int totalAbsorb = 0;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && !heroesAttackType[i].equals("Golem")) {
                totalAbsorb += bossDamage / 5;
            }
        }
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && heroesAttackType[i].equals("Golem")) {
                heroesHealth[i] -= totalAbsorb;
                break;
            }
        }
    }

    public static void heroesAttack() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0 && heroesDamage[i] > 0) {
                if (bossDefence.equals(heroesAttackType[i])) {
                    continue;
                }
                bossHealth -= heroesDamage[i];
                if (bossHealth < 0) bossHealth = 0;
            }
        }
    }

    public static void medicHeal() {
        int medicIndex = -1;
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (heroesAttackType[i].equals("Medic") && heroesHealth[i] > 0) {
                medicIndex = i;
                break;
            }
        }
        if (medicIndex == -1) return;

        for (int i = 0; i < heroesHealth.length; i++) {
            if (i != medicIndex && heroesHealth[i] > 0 && heroesHealth[i] < 100) {
                heroesHealth[i] += 30;
                System.out.println("Medic healed " + heroesAttackType[i]);
                break;
            }
        }
    }

    public static void thorStun() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesAttackType[i].equals("Thor") && heroesHealth[i] > 0) {
                if (new Random().nextBoolean()) {
                    bossStunned = true;
                    System.out.println("Thor stunned the Boss!");
                }
                break;
            }
        }
    }

    public static void printStatistics() {
        System.out.println("ROUND " + roundNumber + " -------------------");
        System.out.println("Boss health: " + bossHealth);
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " + heroesHealth[i]);
        }
    }
}
