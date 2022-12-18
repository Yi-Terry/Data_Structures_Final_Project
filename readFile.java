//package finalProject;
import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
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
                String activityDifficulty = ary[1];
//
                databaseList.add(activityName);
                difficultyList.add(activityDifficulty);


            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }

    }

    public static void readQuoteDatabase(){
        String fileName = "quotes.csv";

        try{
            Scanner inputStream = new Scanner(new File(fileName));
            String line = inputStream.nextLine();
            while(inputStream.hasNextLine()){
                line = inputStream.nextLine();

                String[] ary = line.split("//");
                String quote = ary[0];
                String AuthorOfQuote = ary[1];

                quotes.add(quote);
                authorOfQuote.add(AuthorOfQuote);


            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }





}
