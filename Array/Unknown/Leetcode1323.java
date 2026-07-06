class Solution {
    public int maximum69Number (int num) {
        String number=String.valueOf(num);
        boolean defination=false;
        int n=0;
        for(char ch:number.toCharArray()){
            int numval=ch-'0';
            if(numval==6 && defination==false){
                 n=n*10+9;
                 defination=true;
            }else{
                n=n*10+numval;
            }
        }
        return n;
    }
}