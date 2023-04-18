// Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.

package PW_Skills_Assignment.PW_Assignment_9;

public class PW_Ass_9_QST_1 {

    void positiveValue(){
        int arr[]={2,6,-5,-1,0,4,-9};

        for(int i=0;i< arr.length;i++)
            if(arr[i]>=0){
                System.out.println(arr[i]);


            }
        }



    public static void main(String[] args) {
        PW_Ass_9_QST_1 obj=new PW_Ass_9_QST_1();
        obj.positiveValue();
    }
}
