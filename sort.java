//package finalProject;

public class sort extends habitProjectMain {
    static int k =1;
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
    

/** prints the tasks list in first to last order entered*/
    public static void firstLast()
    {
        while( k <= q1.size())
{
    System.out.println("-"+q1.poll());


}

    }
/** prints the task list in last to first order entered*/
    public static void lastFirst()
    {
        for(int j = s1.size(); j>0; j--)
        {
            if(!s1.isEmpty()) {
                s2.addElement(s1.peek());
                System.out.println("-" + s1.pop());

            }

            else if(s1.isEmpty())
            {
                s1.addElement(s2.peek());
                System.out.println("-" + s2.pop());

            }


        }


    }
}