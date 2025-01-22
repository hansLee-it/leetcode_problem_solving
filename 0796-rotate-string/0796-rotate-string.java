class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        else if(s.length() != goal.length()) return false;
        else if((s+s).indexOf(goal) > -1) return true;
        else return false;
    }
}