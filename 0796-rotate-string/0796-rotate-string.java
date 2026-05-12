class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String result = s + s;
        for(int i=0;i<=result.length()-goal.length();i++){
            if(result.substring(i, i + goal.length()).equals(goal)){
                return true;
            }
        }
        return false;

        
    }
}