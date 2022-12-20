//package finalProject;


import java.util.Scanner;

public class checkOff extends habitProjectMain {

    /**
     * Allows the user to check off tasks that they have completed
     * Adds points to user total after task is completed
     */

    public static void checkOffList() {

        Scanner kb3 = new Scanner(System.in);

        System.out.println(taskList);

        System.out.println("choose 1 task you would like to remove.");

        String ans = kb3.nextLine();


        for (int i = 0; i < taskList.size(); i++) {
            if(ans.equals(taskList.get(0)))
            {
                taskList.remove(0);
                sumPoints += pointMap.get(ans);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Task has been completed!");
                System.out.println("Total points:");
                System.out.println(sumPoints);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

            }

            else if (ans.equals(taskList.get(i))) {
                taskList.remove(i);
                sumPoints += pointMap.get(ans);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Task has been completed!");
                System.out.println("Total points:");
                System.out.println(sumPoints);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");


            }

            else if (ans != taskList.get(i))
            {
                System.out.println("This task does not exist in the list. \n" +
                        "Please choose one that is in your list.");
                checkOffList();
            }
            }

            if (taskList.isEmpty()) {
            System.out.println("You have completed all of your tasks! \n" +
                    "Add more!");


        }
    }
}







