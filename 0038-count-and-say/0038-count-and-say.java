class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String recResult = countAndSay(n-1);
        String result = "";
        char base = recResult.charAt(0);
        int loopTime = 0;
        int count = 0;
        for(char c : recResult.toCharArray()){
            if(base != c){ 
                // make count and base into String and add to the result && reset count
                result += String.valueOf(count) + String.valueOf(base);
                base = c;
                count = 1;
            }else{ // if (base == c) rise count;
                count++;
            }
            loopTime++;
            if(loopTime == recResult.length())
                result += String.valueOf(count) + String.valueOf(base);
        }

        return result;
    }
}