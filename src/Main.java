public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.MAGIC, "Dark Staff");
        Boss boss = new Boss(500, 80, bossWeapon);
        boss.printInfo();

        System.out.println("\nSkeletons:");

        Weapon skelWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        Skeleton skeleton1 = new Skeleton(150, 30, skelWeapon1, 10);
        skeleton1.printInfo();

        System.out.println();

        Weapon skelWeapon2 = new Weapon(WeaponType.BOW, "Shadow Bow");
        Skeleton skeleton2 = new Skeleton(180, 35, skelWeapon2, 15);
        skeleton2.printInfo();
    }
}
