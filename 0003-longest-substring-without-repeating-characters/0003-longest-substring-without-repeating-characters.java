class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        String word = "";
        int result = 0;
        for(int i=0;i<array.length;i++){
            int idx = word.indexOf(array[i]);
            if(idx > -1){
                word = word.substring(idx+1);
                word += Character.toString(array[i]);
            }else{
                word += Character.toString(array[i]);
            }
            if(word.length() > result)
                result = word.length();
        }
        return result;
        
    }
}