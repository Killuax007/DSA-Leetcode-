public class Q852 {
    static  int peakEleInMountainArr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int middle=start+(end-start)/2;
            if(arr[middle]>arr[middle+1]){
                end=middle;
            }
            else {
                start=middle+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
int[] arr={0,1,2,6,8,10,8,6,4,2,1};
        System.out.println(peakEleInMountainArr(arr));
    }
}
