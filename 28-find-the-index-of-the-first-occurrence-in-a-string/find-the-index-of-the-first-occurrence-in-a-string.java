class Solution {
    public int strStr(String haystack, String needle) {
        int len =haystack.length();
        int ans =-1;
        l:
        for(int i=0;i<len;i++){
            int count =0;
            for(int j=0;j<needle.length();j++){
                if(i+j>=len){
                    continue l;
                }
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    count++;
                    if(count==needle.length())return i;
                }
                else{

                    continue l;
                }
            }
        }
        return ans;
    }
}