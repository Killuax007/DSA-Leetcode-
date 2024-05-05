
public class leetcode1672 {
    public static void main(String[] args) {

    }
    public int maximumWealth(int [][] accounts){
        int max=Integer.MIN_VALUE;
//row=peerso col=acc
        for (int person = 0; person <accounts.length ; person++) {
            int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
            sum+=accounts[person][account];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
