package FinalProject;
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

                //Asks for the difficultly of the task
            System.out.println("How difficult is this task? \n 1. Easy \n 2. Medium \n 3. Hard");
                    int difInput = kb2.nextInt();
                    switch(difInput) {
                        case 1:
                            testMap.put(task, easyPoints);
                            break;

                        case 2:
                            testMap.put(task, mediumPoints);
                            break;

                        case 3:
                            testMap.put(task, hardPoints);
                            break;
                    }
        }
        System.out.println(taskList);
    }

    //This method allows the user to see the amount of points each of their tasks are based on their difficulty
    public static void taskNameandPoints()
    {
        for (int i =0; i< taskList.size(); i++) {

        }
    }
}