// Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
//for calculating the minimum element.

package PW_Skills_Assignment.PW_Assignment_9;

public class PW_Ass_9_QST_4 {

    void minimum(){
        int arr[]={2,-3,5,8,1,0,-4};

        int ans=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println("Minimum: "+ans);

    }

    public static void main(String[] args) {
        PW_Ass_9_QST_4 obj=new PW_Ass_9_QST_4();
        obj.minimum();
    }
}
