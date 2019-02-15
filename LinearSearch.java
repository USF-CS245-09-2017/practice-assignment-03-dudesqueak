public class LinearSearch implements Practice03Search {
    public String searchName(){

        return "linear";
    }
    public int search(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
