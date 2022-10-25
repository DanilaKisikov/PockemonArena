public class Pockemon
{

    private int level = 1;
    public double health;
    private double damage;
    private String name;

    public void setHealth()
    {

    }

    public Pockemon(String name , int level)
    {
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel()
    {
        return this.level;
    }

    public double getHealth()
    {
        return this.health;
    }

    public double giveDamage()
    {

        return damage;
    }
    public void takeDamage(double damage, Pockemon attacker)
    {
        this.health -= damage;
    }

}
