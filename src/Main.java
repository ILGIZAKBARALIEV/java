
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.setDefenceType("Magic");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defence Type: " + boss.getDefenceType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Ability: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 20, "Fireball");
        Hero hero2 = new Hero(300, 15);
        Hero hero3 = new Hero(280, 25, "Heal");

        return new Hero[]{hero1, hero2, hero3};
    }
}
