//package finalProject;

import java.util.Objects;
import java.util.Scanner;

public class checkOff extends habitProjectMain {


    public static void checkOffList() {

        Scanner kb3 = new Scanner(System.in);

        System.out.println(taskList);

        System.out.println("choose a task you would like to remove.");

        String ans = kb3.nextLine();


        for (int i = 0; i < taskList.size(); i++) {

            if(!ans.equals(taskList.get(i)))
            {
                System.out.println("Please choose a task that belongs in your list.");
                checkOffList();
            }


            else if(ans.equals(taskList.get(0)))
            {
                taskList.remove(0);
                System.out.println("Task has been completed!");
            }

            else if (ans.equals(taskList.get(i))) {
                taskList.remove(i);
                System.out.println("Task has been completed!");

            }
            }

        if (taskList.isEmpty()) {
            System.out.println("You have completed all of your tasks! \n" +
                    "Add more!");


        }
    }
}







