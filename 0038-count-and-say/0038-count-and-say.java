class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String recResult = countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1; i < recResult.length(); i++){
            if(recResult.charAt(i-1) != recResult.charAt(i)){ 
                // make count and base into String and add to the result && reset count
                result.append(count).append(recResult.charAt(i-1));
                count = 1;
            }else{ // if (base == c) rise count;
                count++;
            }
        }
        result.append(count).append(recResult.charAt(recResult.length()-1));
        return result.toString();
    }
}