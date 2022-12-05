package finalProject;

import java.util.*;
import java.util.Scanner;

public class createNewTasks extends habitProjectMain{

//Method used to create task
   public static void taskCreator(){

        Scanner kb2 = new Scanner(System.in);
        System.out.println("How many tasks would you like to create?");
        int input = kb2.nextInt();


        for(int i = 1; i <= input; i++)
        {
            //Asks user to enter a task
            //adds to the arraylist
            System.out.println("Please enter in task "+i);
                String task = kb2.next();
                taskList.add(task);
                q1.add(task);
               s1.push(task);
////////////////////////////////////////////////////////////////////////////////

                //Asks for the difficultly of the task
            System.out.println("How difficult is this task? \n 1. Easy \n 2. Medium \n 3. Hard");
                    int difInput = kb2.nextInt();
            switch (difInput) {
                case 1:
                    pointMap.put(task, easyPoints);
                    break;

                case 2:
                    pointMap.put(task, mediumPoints);
                    break;
                case 3 :
                    pointMap.put(task, hardPoints);
                    break;
                default :
                    System.out.println("Error. Please, enter a correct number.");
                    break;
            }
        }


        System.out.println(taskList);
    }

    //This method allows the user to see the amount of points each of their tasks are based on their difficulty
    public static void taskNameAndPoints()
    {
        if(taskList.size() == 0){
            System.out.println("No Tasks Found.");
        }else {
            for (String s : taskList) {
                System.out.println("Task Name: " + s);
                System.out.println("Point Worth: " + pointMap.get(s));
                System.out.println("");
            }
        }
    }
}