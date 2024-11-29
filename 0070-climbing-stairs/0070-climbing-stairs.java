class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int p1 = 1, p2 =2;
        for(int i=3; i<=n; i++){
            int current = p1 +p2;         //previous 1st value and previous 2nd value
            p1=p2;
            p2 = current;
        }
        return p2;
    }
}