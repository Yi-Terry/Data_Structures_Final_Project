
import java.util.ArrayList;
import java.util.Scanner;

//start of the task program
public class start extends habitProjectMain{
//
    //
    public static void choose() {
        Scanner kb = new Scanner(System.in);
        //Get random task from database. Use math.random?
        randomize.checkIfUserIsGivenQuote();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1-Add Tasks \n2-Check Existing Tasks \n3-Check Point Status \n4-Check off " +
                "\n5-first to last \n6-last to first\n7-Access the activity database \n8-Check current level");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        int userChoice = kb.nextInt();
        boolean run = false;
        while (!run) {

            switch (userChoice) {
                //adds tasks
                case 1:
                    randomize.giveUserTask();
                    System.out.println("Adding tasks...");
                    createNewTasks.taskCreator();
                    break;
                //prints task list and point values for those tasks
                case 2:
                    System.out.println("The following tasks were recorded:");
                    createNewTasks.taskNameAndPoints();
                    break;
                //Checks total amount of points
                case 3:
                    pointStatus.currentPoints();


                    break;
                //allows user to remove tasks that have been completed
                case 4:
                    checkOff.checkOffList();
                    break;

                case 5:
                    System.out.println("Printing your list...");
                    sort.firstLast();

                    break;

                case 6:
                    System.out.println("Printing your list...");
                    sort.lastFirst();
                    break;
                //Allows user to access database of activities
                case 7:

                    System.out.println("Database Options: \n1-Access database\n2-Access database based on difficulty");
                    int input = kb.nextInt();

                    if(input == 1) {
                        if(bt.countNodes()<1) {
//                            readFile.readDatabase();
                            for (String s : databaseList) {
                                bt.insert(s);
                            }
                            bt.inorder();
                            System.out.println("Total Items: "+bt.countNodes());
                        }else if(bt.countNodes()>0) {
                            System.out.println("Fetching Database...");
                            bt.inorder();
                            System.out.println(bt.countNodes());
                        }
                    }else if(input ==2) {
                        if(list2.isEmpty()) {

                            System.out.println("Printing sorted tasks from increasing difficulty");
                            list1.addAll(databaseList);
                            list2.addAll(difficultyList);
                            int n = difficultyList.size();
                            sort.runStringSort(list2, list1, n);
                            for (String z : list1) {
                                System.out.printf("%s\n", z);
                            }
                        }
                        else {
                            for(String r: list1){
                                System.out.printf("%s\n", r);
                            }
                        }
                    }
                    else{
                        System.out.println("Error. Please enter appropriate number");
                    }

                    break;
                case 8:
                    pointStatus.currentLevel();
                    break;

                default:
                    System.out.println("Error");
                    break;
            }

            //Asks if you are done with the program

                System.out.println("Are you finished with the program? Write Yes or No.");
                String continueLoop = kb.next();
                if (continueLoop.equalsIgnoreCase("Yes")) {
                    run = true;
                    System.out.println("Ending Program.");


                    System.exit(0);
                } else {

                    start.choose();
                }
            }
        }


    }