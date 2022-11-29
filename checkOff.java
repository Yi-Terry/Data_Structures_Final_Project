package finalProject;

import java.util.Scanner;

public class checkOff extends habitProjectMain {


    public static void checkOffList()
    {
        Scanner kb3 = new Scanner(System.in);
        System.out.println("Please choose a task you would like to check off. \n" +
                taskList);
       int checkOffInput = kb3.nextInt();

        for(int i = 0; i<=taskList.size(); i++) {
            System.out.println(i +". "+ taskList.get(i));

            if(i == checkOffInput)
            {
                taskList.remove(i);
                start.choose();
            }

        }

    }
}
