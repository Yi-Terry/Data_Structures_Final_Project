//package finalProject;

import java.util.Objects;
import java.util.Scanner;
//
public class checkOff extends habitProjectMain {

//
    public static void checkOffList() {

        Scanner kb3 = new Scanner(System.in);

        System.out.println(taskList);

        System.out.println("choose a task you would like to remove.");

        String ans = kb3.nextLine();


        for (int i = 0; i < taskList.size(); i++) {
            if(ans.equals(taskList.get(0)))
            {
                taskList.remove(0);
                sumPoints += pointMap.get(ans);
                System.out.println("Adding points");
                System.out.println(sumPoints);
                System.out.println("Task has been completed!");
            }

            else if (ans.equals(taskList.get(i))) {
                taskList.remove(i);
                sumPoints += pointMap.get(ans);
                System.out.println("Testing points:");
                System.out.println(sumPoints);
                System.out.println("Task has been completed!");

            }
            }

        if (taskList.isEmpty()) {
            System.out.println("You have completed all of your tasks! \n" +
                    "Add more!");


        }
    }
}







