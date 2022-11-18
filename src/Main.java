public class Main {
    public static void main(String[] args) {
        Weapon boss1Weapon = new Weapon();
        boss1Weapon.setWeaponName("Scythe");
        boss1Weapon.setWeaponType(WeaponType.MELEE);
        Boss boss1 = new Boss();
        boss1.setHealth(500);
        boss1.setDamage(15);
        boss1.setWeapon(boss1Weapon);
        System.out.println(boss1.printinfo());
        System.out.println("health :" + boss1.getHealth() + " damage: " + boss1.getDamage() + " Weapon " + boss1.getWeapon().getWeaponName() + " "+ boss1.getWeapon().getWeaponType());
        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setWeaponType(WeaponType.RANGE);
        skeletonWeapon.setWeaponName("Bow");
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(350);
        skeleton1.setDamage(30);
        skeleton1.setWeapon(skeletonWeapon);
        skeleton1.setArrow(30);
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setArrow(50);
        skeleton2.setDamage(50);
        skeleton2.setHealth(280);
        skeleton2.setWeapon(skeletonWeapon);
        System.out.println(skeleton1.info());
        System.out.println(skeleton2.info());

    }
}