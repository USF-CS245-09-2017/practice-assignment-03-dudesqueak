public class BinaryIterativeSearch implements Practice03Search{
    public String searchName(){
        return "binary iterative";
    }
    public int search(int [] arr, int target){
        int start = 0;
        int end = arr.length;
        while (end > start){
           int middle = (start + end) / 2;
            if(arr[middle] == target){
                return middle;
            }
            else if (target < arr[middle]){
                end = middle;
            }
            else{
                start = middle +1;
            }
        }
        return -1;
    }

}
