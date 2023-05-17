public class GameEntity {
    private int health;
    private int damage;


    public int getHeath() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String info(){return "health: "+this.health +"| damage: "+this.damage;}
}

