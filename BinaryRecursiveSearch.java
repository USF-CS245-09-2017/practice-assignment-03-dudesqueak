public class BinaryRecursiveSearch implements Practice03Search {
    public String searchName(){
        return "binary recursive";
    }
    public int search(int [] arr, int target){
        return search(arr, target, 0, arr.length);
    }
    public int search(int [] arr, int target, int start, int end){
        if(start == end){
            return -1;
        }
        else{
            int middle = (start + end)/2;
            if(arr[middle] == target){
                return middle;
            }
            else if (target < arr[middle]){
                return search(arr, target, start, middle);
            }
            else{
                return search(arr, target, middle + 1, end);
            }
        }
    }

}
