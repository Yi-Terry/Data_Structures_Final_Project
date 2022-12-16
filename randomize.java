public class randomize extends habitProjectMain{
    public static void checkIfUserIsGivenQuote(){
        if(!dailyQuoteGiven){
            randomize.giveUserQuote();
            dailyQuoteGiven = true;
        }
    }

   public static void giveUserTask(){
        int max = databaseList.size();
        int min = 1;
        int range = max - min + 1;
        int rand1= (int) (Math.random() * range) + min;
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("We suggest adding the following habit: "+ databaseList.get(rand1));
        System.out.println("-------------------------------------------------------------------------------------------");
    }

     public static void giveUserQuote(){
         int max = quotes.size();
         int min = 1;
         int range = max - min + 1;
         int rand2 = (int) (Math.random() * range) + min;
         System.out.println("Quote of the Day: \n"+ quotes.get(rand2)+"\n-"+authorOfQuote.get(rand2));

     }
}
