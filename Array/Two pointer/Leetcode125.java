class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        int left=0;
        int right=sb.length()-1;
        boolean ans=true;
        while(right>left){
            if(sb.charAt(left)!=sb.charAt(right) ){
                ans=false;
            }
            right--;
            left++;
        }
        return ans;
    }
}