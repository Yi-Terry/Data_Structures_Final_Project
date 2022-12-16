//package finalProject;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
/**
 * @author Terry, Josh, John
 * @date 11/19/2022
 * @version 1.01
 *
 */

    /*
    THINGS TO FIX
    -If the user enters a number other than 1,2, or 3 for the task, it will return null and break the program if the
    user tries to check it off
    -When choosing cases 5 and 6 and the habit list is empty, the program will say it will print out the list but then
    prints nothing
    -If the user decides to check their points but havent checked off anything, it will say they have 1 point
    -Points do not do anything yet
*/
public class habitProjectMain
{
    //Arraylist(task list), points
    static ArrayList<String>list1 =new ArrayList<>();
    static ArrayList<String>list2 =new ArrayList<>();
    static ArrayList<String> taskList = new ArrayList<String>();
    static ArrayList<String> quotes = new ArrayList<>();
    static ArrayList<String> authorOfQuote = new ArrayList<>();
    Scanner kb1 = new Scanner(System.in);
    static int hardPoints = 20;
    static int mediumPoints = 10;
    static int easyPoints = 5;
    static int sumPoints = 1;
    static int lvl1 = 1;
    static int lvl2 = 10;
    static int lvl3 = 20;
    static int lvl4 = 30;
    static int lvl5 = 40;
    static int lvl6 = 50;

    static ArrayList<String>difficultyList = new ArrayList<>();
    static HashMap<String, Integer> pointMap = new HashMap<String, Integer>();
    static ArrayList<String>databaseList =new ArrayList<>();
    static BTStrings bt = new BTStrings();
    static Queue<String> q1 = new LinkedList<String>();
    static Stack<String> s1 = new Stack<String>();
    static Stack<String> s2 = new Stack<String>();
    static boolean dailyQuoteGiven = false;

//setters and getters
    public static ArrayList<String> getTaskList(int i) {
        return taskList;
    }

    public static void setTaskList(ArrayList<String> taskList) {
        habitProjectMain.taskList = taskList;
    }

    public Scanner getKb1() {
        return kb1;
    }

    public void setKb1(Scanner kb1) {
        this.kb1 = kb1;
    }

    public static int getHardPoints() {
        return hardPoints;
    }

    public static void setHardPoints(int hardPoints) {
        habitProjectMain.hardPoints = hardPoints;
    }

    public static int getMediumPoints() {
        return mediumPoints;
    }

    public static void setMediumPoints(int mediumPoints) {
        habitProjectMain.mediumPoints = mediumPoints;
    }

    public static int getEasyPoints() {
        return easyPoints;
    }

    public static void setEasyPoints(int easyPoints) {
        habitProjectMain.easyPoints = easyPoints;
    }

    public static int getSumPoints() {
        return sumPoints;
    }

    public static void setSumPoints(int sumPoints) {
        habitProjectMain.sumPoints = sumPoints;
    }

    public static HashMap<String, Integer> getPointMap() {
        return pointMap;
    }

    public static void setPointMap(HashMap<String, Integer> pointMap) {
        habitProjectMain.pointMap = pointMap;
    }

    public static Queue<String> getQ1() {
        return q1;
    }

    public static void setQ1(Queue<String> q1) {
        habitProjectMain.q1 = q1;
    }

    public static Stack<String> getS1() {
        return s1;
    }

    public static void setS1(Stack<String> s1) {
        habitProjectMain.s1 = s1;
    }

    /*
    -use binary tree to recommend user new tasks to try and add into the list. Also, show the amount of points that task costs.
    -sort recommended tasks from data file into easy-hard order.
    -save all tasks into a file so that it can be brought back up when the program is loaded again
    -use queue to order the lst from first to last input
    -use stack to order the list from last to first input    *DONE*
*/

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n" +
                " __          __  _                            _          _    _       _     _ _     _______             _             \n" +
                " \\ \\        / / | |                          | |        | |  | |     | |   (_) |   |__   __|           | |            \n" +
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   | |__| | __ _| |__  _| |_     | |_ __ __ _  ___| | _____ _ __ \n" +
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  |  __  |/ _` | '_ \\| | __|    | | '__/ _` |/ __| |/ / _ \\ '__|\n" +
                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |  | | (_| | |_) | | |_     | | | | (_| | (__|   <  __/ |   \n" +
                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|  |_|\\__,_|_.__/|_|\\__|    |_|_|  \\__,_|\\___|_|\\_\\___|_|   \n" +
                "                                                                                                                      " +
                "                                                                                                                      ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        readFile.readDatabase();
        readFile.readQuoteDatabase();
        start.choose();


        /////////////////////////////////////////////////////////
    }
}