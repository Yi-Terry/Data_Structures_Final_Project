import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile extends habitProjectMain{
    public static void readDatabase(){
        String fileName = "activityData.csv";
        int difficulty =0;

        try{
            Scanner inputStream = new Scanner(new File(fileName));
            String line = inputStream.nextLine();
            while(inputStream.hasNextLine()){
                line = inputStream.nextLine();
                String[] ary = line.split(",");
                String activityName = ary[0];
//                String activityDifficulty = ary[1];
////                switch (activityDifficulty){
////                    case "1":
////                        System.out.println(activityName +"\nDifficulty: Easy\n");
////                        break;
////                    case "2":
////                        System.out.println(activityName +"\nDifficulty: Medium\n");
////                        break;
//                    case "3":
//                        System.out.println(activityName +"\nDifficulty: Hard\n");
//                        break;
//                    default:
//                        System.out.println("");
//                }

                databaseList.add(activityName);

            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }

    }

}
