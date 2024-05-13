
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int str = 0;
        int end = letters.length - 1;
        while (str <= end) {
            int mid = str + (end - str) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else  {
                str = mid + 1;
            }
            }
    return letters[str%letters.length];
        
    }
}
