package PW_Skills_Assignment.PW_Assignment_12;

public class PW_Ass_12_QST_3 {

    static int findPlatform(int arr[],int dep[],int n){
        int plat_needed=1; int result=1;
        for(int i=0;i< arr.length;i++){
            plat_needed=1;
            for(int j=0;j< arr.length;j++){
                if(i != j){
                    if(arr[i]<arr[j] && dep[j]<arr[i]){
                        plat_needed++;
                    }
                    result=Math.max(plat_needed,result);

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={900,950,1000,1200};
        int dep[]={910,960,2000,1300};
        int n=4;
        System.out.println("The platform are: "+findPlatform(arr,dep,n));

    }
}
