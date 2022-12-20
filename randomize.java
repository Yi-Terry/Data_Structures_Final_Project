import java.util.Scanner;

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
       System.out.println("Would you like to add it? Y or N?");
       Scanner temp = new Scanner(System.in);
       String input = temp.next();
       if(input.equalsIgnoreCase("Y")){
           taskList.add(databaseList.get(rand1));
           q1.add(databaseList.get(rand1));
           s1.push(databaseList.get(rand1));
           int valueOfDifficulty = Integer.parseInt(difficultyList.get(rand1));
           if(valueOfDifficulty == 1) {
               pointMap.put(databaseList.get(rand1), easyPoints);
               System.out.println("Task Added");
           }else if(valueOfDifficulty ==2){
               pointMap.put(databaseList.get(rand1), mediumPoints);
               System.out.println("Task Added");
           }else{
               pointMap.put(databaseList.get(rand1), hardPoints);
               System.out.println("Task Added.");
           }
       }else{
           System.out.println("");
       }
    }

     public static void giveUserQuote(){
         int max = quotes.size();
         int min = 0;
         int range = max - min + 1;
         int rand2 = (int) (Math.random() * range) + min;
         System.out.println("Quote of the Day: \n"+ quotes.get(rand2)+"\n-"+authorOfQuote.get(rand2));

     }
}
