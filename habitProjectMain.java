//package finalProject;


import java.util.*;
import java.util.Scanner;
/**
 * @author Terry, Josh, John
 * @date 11/19/2022
 * @version 1.01
 */


public class habitProjectMain
{
    //Arraylist(task list), points
    static ArrayList<String>list1 =new ArrayList<>();
    static ArrayList<String>list2 =new ArrayList<>();
    static ArrayList<String> taskList = new ArrayList<String>();
    static LinkedList<String> quotes = new LinkedList<>();
    static LinkedList<String> authorOfQuote = new LinkedList<>();
    Scanner kb1 = new Scanner(System.in);
    static int hardPoints = 20;
    static int mediumPoints = 10;
    static int easyPoints = 5;
    static int sumPoints = 0;
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



    public static void main(String[] args)  {
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
    }
}