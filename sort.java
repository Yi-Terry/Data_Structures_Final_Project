//package finalProject;

import java.util.ArrayList;

public class sort extends habitProjectMain {

//
//    public static void bubbleSort(String taskList) {
//        int n = taskList.length();
//        int temp = 0;
//        for(int i=0; i < n; i++){
//            for(int j=1; j < (n-i); j++){
//                if(taskList[j-1] > taskList[j]){
////swap the elements!
//                    temp = taskList[j-1];
//                    taskList[j-1] = taskList[j];
//                    taskList[j] = temp;
//                }
//            }
//        }
//    }
    


    public static void firstLast()
    {
        System.out.println(q1.size());
        System.out.println(getQ1());
        for(int i = 1; i <= q1.size(); i++)
        {
            System.out.println(i+". "+q1.poll());
        }


    }

    public static void lastFirst()
    {
        for(int j = s1.size(); j>0; j--)
        {
            System.out.println(j+". "+s1.pop());
        }
    }

    public static void sortStrings(ArrayList<String> arr, int n){
        String temp;
        for(int i =0; i < n-1; i++){
            for(int j =i+1; j<n;j++){
                if(arr.get(i).compareTo(arr.get(j))>0){
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }
}
