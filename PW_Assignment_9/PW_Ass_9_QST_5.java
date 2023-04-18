// Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}.

package PW_Skills_Assignment.PW_Assignment_9;

public class PW_Ass_9_QST_5 {

    void peak(){
        int arr[]={1,1,3,4,2,3,5,7,0};

        for(int i=1;i< arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);


            }

        }
    }

    public static void main(String[] args) {
        PW_Ass_9_QST_5 obj=new PW_Ass_9_QST_5();
        obj.peak();
    }
}
