public class demo1{
    
    public static int maxInt(int[] arr){

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }        
}
