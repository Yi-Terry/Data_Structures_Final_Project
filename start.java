package FinalProject;

import java.util.Scanner;

//start of the task program
public class start extends habitProjectMain{

    public static void choose() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Task System. What would you like to do?");
        System.out.println("1-Add Tasks \n2-Check Existing Tasks \n3-Check Point Status \n4-Check off");
        int userChoice = kb.nextInt();
        boolean run = false;
        while (!run) {

            switch (userChoice) {
                //adds tasks
                case 1:
                    System.out.println("Adding tasks...");
                    createNewTasks.taskCreator();
                    break;
                    //prints task list and point values for those tasks
                case 2:
                    System.out.println("The following tasks were recorded:");
                    System.out.println(taskList);
                    createNewTasks.taskNameandPoints();
                    break;
                    //Checks total amount of points
                case 3:
                    System.out.println("Test 3");
                    break;
                    //allows user to remove tasks that have been completed
                case 4:
                    System.out.println("test 4");

                default:
                    System.out.println("Error");
                    break;
            }

            //Asks if you are done with the program
            System.out.println("Are you finished with the program?");
            String continueLoop = kb.next();
            if (continueLoop.equalsIgnoreCase("Yes")) {
                run = true;
                System.out.println("Ending Program.");


                System.exit(0);
            }else{
                start.choose();
            }
        }
    }
}