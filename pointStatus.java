package finalProject;

public class pointStatus extends habitProjectMain
{


    public static void currentPoints(){

        System.out.println("Displaying current points: \n " +
                sumPoints);


    }

    public static void currentLevel()
    {
       if(sumPoints <= lvl1 )
       {
           System.out.println("Displaying current level: \n"
           +"Level 1");


       }

       else if(sumPoints > lvl1 && sumPoints >= lvl2 && sumPoints < lvl3)
       {
           System.out.println("Displaying current level: \n"
                   +"Level 2");
       }

       else if(sumPoints > lvl2 && sumPoints >= lvl3 && sumPoints<lvl4)
       {
           System.out.println("Displaying current level: \n"
                   +"Level 3");
       }

       else if(sumPoints > lvl3 && sumPoints >= lvl4 && sumPoints < lvl5)
       {
           System.out.println("Displaying current level: \n"
                   +"Level 4");
       }

       else if(sumPoints > lvl4 && sumPoints >= lvl5 && sumPoints < lvl6)
       {
           System.out.println("Displaying current level: \n"
                   +"Level 5");
       }

       else if(sumPoints > lvl5 && sumPoints >= lvl6)
       {
           System.out.println("Displaying current level: \n"
                   +"Level 6");
       }
    }
}