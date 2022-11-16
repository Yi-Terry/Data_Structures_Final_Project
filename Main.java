import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Scanner tool to read user input
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Task System. What would you like to do?");
        System.out.println("1-Enter New Tasks \n2-Check Existing Tasks \n3-Check Point Status");
        int userChoice = kb.nextInt();


        //////////////////////////////////////////////////////////
        //If-statement to direct user to appropriate menu
        if((userChoice !=1)&&(userChoice != 2)&&(userChoice!=3)){
            System.out.println("Error");
        }else if(userChoice ==1){
          createNewTasks.testMethod();
        }else if(userChoice ==2){
            System.out.println("Test2");
        }else {
            System.out.println("test3");
        }
        /////////////////////////////////////////////////////////
    }
}
