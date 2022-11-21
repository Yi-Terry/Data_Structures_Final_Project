

import java.util.*;
import java.util.Scanner;
/**
 * @author Terry, Josh, John
 * @date 11/19/2022
 * @version 1.01
 * @changes Added method to print out tasks and the points those tasks are worth.
 */
public class habitProjectMain
{
    //Arraylist(task list), points

    static ArrayList<String> taskList = new ArrayList<String>();
    Scanner kb1 = new Scanner(System.in);
    static int hardPoints = 20;
    static int mediumPoints = 10;
    static int easyPoints = 5;
    static int sumPoints = 0;
    static HashMap<String, Integer> pointMap = new HashMap<String, Integer>();




    public static void main(String[] args) {

       start.choose();

        //////////////////////////////////////////////////////////
        //If-statement to direct user to appropriate menu
//        if((userChoice !=1)&&(userChoice != 2)&&(userChoice!=3)){
//            System.out.println("Error");
//
//        }else if(userChoice ==1){
//            createNewTasks.testMethod();
//
//        }else if(userChoice ==2){
//            System.out.println("Test2");
//        }else {
//            System.out.println("test3");
//        }
        /////////////////////////////////////////////////////////
    }
}



