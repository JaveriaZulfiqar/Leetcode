class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int target = x;
        while(x > 0){
            int temp= x % 10;  //remainder 121%10=1 | 12%10=2 | 1%10=1
            x=x/10;  //quotient     12 | 12/10 | 1  | 1/10=0
            sum= sum * 10 + temp;   // 0*10+1= 1 | 1*10+2=12 | 12*10+1=121
        }
        return sum == target;
    }
}