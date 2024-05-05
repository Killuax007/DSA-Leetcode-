
public class leetcode1295 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findnumbers(nums));
        System.out.println(digits(-1234));
    }
    static int findnumbers(int[] nums){
    int count=0;
    for (int num:nums){
        if (even(num)){
            count++;
        }
    }
    return count;
    }
    static boolean even(int num){
    int numofdigit=digits(num);
    return numofdigit%2==0;
    }
    static int digits(int num){
        if (num<0){
            num=num*-1;
        }
       int count=0;
       while (num>0){
           count++;
           num=num/10;
       }
       return count;
    }
}
