package finalProject;

import java.util.Scanner;

public class checkOff extends habitProjectMain {


    public static void checkOffList() {
            int i;
        for( i = 1; i <= taskList.size(); i++)
        {
            System.out.println(i+". "+ taskList.get(i));
        }


        Scanner kb3 = new Scanner(System.in);

        System.out.println("Please choose a task you would like to check off. \n" +
                taskList);
        int checkOffInput = kb3.nextInt();

        if (i == checkOffInput) {
            System.out.println("Checking off list item " + i);
            taskList.remove(i);
            q1.remove(i);


        } else {
            System.out.println("error, this task does not exist \n" +
                    "Please choose a task that is in your list.");
            checkOffList();
        }
    }
    }