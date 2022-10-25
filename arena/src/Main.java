import java.util.ArrayList;
import java.util.Random;

public class Main
{
    private static ArrayList<Pockemon> team1 = new ArrayList<>();
    private static ArrayList<Pockemon> team2 = new ArrayList<>();

    private static void addPokemons()
    {
        team1.add(new Sloupock("мама", 10));
        team1.add(new Skvirtl("Крутяк", 10));

        team2.add(new Skvirtl("Гав", 10));
        team2.add(new Sloupock("Амогус", 10));
    }

    private static void setAllHealth()
    {
        for (Pockemon guy:team1)
        {
            guy.setHealth();
        }
        for (Pockemon guy:team2)
        {
            guy.setHealth();
        }
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }


    public static void main(String[] args) {

        Boolean h = true;
        addPokemons();
        int a = 0;
        int guyTeam1 = 0;
        int guyTeam2 = 0;
        Random random = new Random();
        setAllHealth();
        int guy;



        while (h == true)
        {

            if (a%2 == 1)
            {
                guyTeam1++;
                if (guyTeam1 > team1.size() - 1)
                {
                    guyTeam1 = 0;

                if (team2.size() != 1)
                {
                    guy = random.nextInt(team2.size());
                }
                else
                {
                    guy = 0;
                }

                team2.get(guy).takeDamage(team1.get(guyTeam1).giveDamage(), team1.get(guyTeam1));

                if (team2.get(guy).getHealth() < 0)
                {
                    System.out.println(team2.get(guy).getName() + " помер");
                    team2.remove(team2.get(guy));
                }

                }
            }



            else
            {
                guyTeam2++;
                if (guyTeam2 > team2.size() - 1)
                {
                    guyTeam2 = 0;
                }

                if (team1.size() != 1)
                {
                    guy = random.nextInt(team1.size());
                }
                else
                {
                    guy = 0;
                }

                team1.get(guy).takeDamage(team2.get(guyTeam2).giveDamage(), team2.get(guyTeam2));

                if (team1.get(guy).getHealth() < 0)
                {
                    System.out.println(team1.get(guy).getName() + " помер");
                    team1.remove(team1.get(guy));
                }

            }



            if (team1.size() == 0)
            {
                System.out.println("\nКоманда номер 2 выграла!");
                h =false;
            }

            if (team2.size() == 0)
            {
                System.out.println("\nКоманда номер 1 выграла!");
                h =false;
            }



            wait(500);

            a++;
        }

    }

}