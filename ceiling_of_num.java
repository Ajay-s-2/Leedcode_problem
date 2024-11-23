public class ceiling_of_num{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int num = 11;// traget
        int answer= ceiling(arr,num);
        System.out.println(answer);
    }
    // traget number grater than or equal to num
    static int ceiling(int[] arr,int num){
        // what if ? the traget number is greater then the ("gratest number in the array")
        if (num> arr[arr.length-1]){ 
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<num){
                start = mid+1;
            }
            else if(arr[mid]>num){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
