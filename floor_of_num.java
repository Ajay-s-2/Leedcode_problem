public class floor_of_num {
        public static void main(String[] args){
            int[] arr = {1,2,3,4,5,7,8,9,10};
            int num = 6;
            int answer= floor(arr,num);
            System.out.println(answer);
        }
        // hint : traget number less than or equal to num
        static int floor(int[] arr,int num){
            int start = 0; //start index
            int end = arr.length-1; //end index
            while(start<=end){ //while start is less than or equal to end
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
            return arr[end];
        } 
}
