class Solution {
    private static boolean checkpalindrome(String num){
        int left =0;
        int right=num.length()-1;
        while(left<right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String num =x + "";
        return checkpalindrome(num); 
    }
}