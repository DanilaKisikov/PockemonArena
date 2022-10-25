import java.util.Random;

public class Sloupock extends Pockemon
{
    Random random = new Random();

    public Sloupock(String name, int level)
    {
        super(name, level);
    }

    public void setHealth()
    {
        this.health = this.getLevel() * 50;
    }

    public double giveDamage()
    {
        double damage = 10 * this.getLevel();
        return damage;
    }
    public void takeDamage(double damage, Pockemon attacker) {
        int a = random.nextInt(10);
        if (a == 0) {
            System.out.println(this.getName() + " уклонился от удара " + attacker.getName() + ". " + this.health);
        } else if (a < 5) {
            this.health -= 0.8 * damage;
            System.out.println(this.getName() + " получил по лицу от " + attacker.getName() + " на " + 0.8 * damage + " урона. " + this.health);
        } else {
            this.health -= damage;
            System.out.println(this.getName() + " больно получил по лицу от " + attacker.getName() + " на " + damage + " урона. " + this.health);
        }
    }
}
