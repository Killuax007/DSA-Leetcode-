
public class Q34 {
      static int search(int[] arr, int target , boolean startIndex){
          int ans=-1;
          int start=0;
          int end=arr.length-1;
          while(start<=end){
              int middle=start+(end-start)/2;
              if(target<arr[middle]){
                  end=middle-1;
              }
              else if(target>arr[middle]){
                  start=middle+1;
              }
              else{
                  ans=middle;
                  if(startIndex){
                      end=middle-1;
                  }
                  else{
                      start=middle+1;
                  }
              }
          }
          return ans;
      }
       static int[] searchRange(int[] nums, int target){
          int[] ans={-1,-1};
          ans[0]=search(nums,target,true);
          if(ans[0]!=-1){
              ans[1]=search(nums,target,false);
          }
          return  ans;
      }
    public static void main(String[] args) {
    int[] arr={1,3,56,3,87};
    int target=3;
    int[] result=searchRange(arr,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
