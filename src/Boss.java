public class Boss extends GameEntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printinfo(){
        return "health :" + this.health + " damage: " + this.damage + " weapon :" + this.weapon.getWeaponType() + " "+ this.weapon.getWeaponName();

    }
}