public class Boss extends GameEntity{
    private Weapon weapon  ;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printinfo(){return super.info()+"| weaponType: "+this.weapon.getWeaponType()+"| weaponName: "+this.weapon.getWeaponName() ;}


}
