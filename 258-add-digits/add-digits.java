class Solution {
    public int addDigits(int num) {
        return recur(num);

        
    }
    private static int recur(int n){
        int sum=0;
        if(n<10){
            return n;
        }
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return recur(sum);

        
    }
}