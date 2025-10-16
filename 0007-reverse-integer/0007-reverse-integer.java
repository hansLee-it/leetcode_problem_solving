class Solution {
    public int reverse(int x) {
        //if x ==123
        // then answer should be 321
        int answer = x % 10;
        while(x != 0){
            x = x /10;
            if(x==0) break;
            int val = x % 10;
            
            answer = (10*answer) + val;
            if(answer%10!=val) //exceed int range
            {
                return 0;
            }
        }
        return answer;
    }
}