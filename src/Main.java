public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        Weapon weapon=new Weapon();
        weapon.setWeaponName("sword");
        weapon.setWeaponType(WeaponType.cutting);
        boss.setWeapon(weapon);
        System.out.println(boss.printinfo());

        Skeleton skeleton=new Skeleton();
        skeleton.setHealth(400);
        skeleton.setDamage(40);
        Weapon weaponSkeleton=new Weapon();
        weaponSkeleton.setWeaponName("crossbow");
        weaponSkeleton.setWeaponType(WeaponType.gunshot);
        skeleton.setWeapon(weaponSkeleton);
        skeleton.setNumberOfArrows(4);
        System.out.println(skeleton.printinfo());

        Skeleton skeleton2=new Skeleton();
        skeleton2.setHealth(300);
        skeleton2.setDamage(30);
        Weapon weaponSkeleton2=new Weapon();
        weaponSkeleton2.setWeaponName("scary sound");
        weaponSkeleton2.setWeaponType(WeaponType.psychological);
        skeleton2.setWeapon(weaponSkeleton2);
        skeleton2.setNumberOfArrows(8);
        System.out.println(skeleton2.printinfo());
    }
}