// Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
//elements.

package PW_Skills_Assignment.PW_Assignment_9;

public class PW_Ass_9_QST_3 {

    void even(){
        int arr[]={0,1,2,3,4,5,6,7,8};

        for(int i=0;i< arr.length;i++){
            if(i % 2==0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        PW_Ass_9_QST_3 obj=new PW_Ass_9_QST_3();
        obj.even();
    }
}
