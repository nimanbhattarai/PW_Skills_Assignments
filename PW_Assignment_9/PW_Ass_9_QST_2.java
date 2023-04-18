// Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//strings stored on odd indices of the array.

package PW_Skills_Assignment.PW_Assignment_9;

public class PW_Ass_9_QST_2 {

    void odd(){
         String arr[]={"ab","bc","cd","de","ef","fg","gh"};

         for(int i=0;i< arr.length;i++){
             if(i % 2!=0){
                 System.out.println(arr[i]);
             }
         }

    }

    public static void main(String[] args) {
        PW_Ass_9_QST_2 obj=new PW_Ass_9_QST_2();
        obj.odd();
    }
}
