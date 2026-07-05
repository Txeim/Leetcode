class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        String S="";
        for(int i=0;i<lower.length();i++){
            if(Character.isLetterOrDigit(lower.charAt(i))){
                S=S+lower.charAt(i);
            }
        }
        int left=0;
        int right=S.length()-1;
        boolean ans=true;
        while(right>left){
            if(S.charAt(left)!=S.charAt(right) ){
                ans=false;
            }
            right--;
            left++;
        }
        return ans;
    }
}