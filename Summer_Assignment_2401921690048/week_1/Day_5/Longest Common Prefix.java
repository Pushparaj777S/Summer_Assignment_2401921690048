class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        String p = new String();
        p = strs[0];
        for( int i = 1; i < strs.length; i++){
            for(int j = 0; j < strs[i].length() && j < p.length(); j++){
                if( p.charAt(j) == strs[i].charAt(j)){
                    s.append(p.charAt(j));
                }
                else{
                    break;
                }
                
                
            }
            p = s.toString();
            s.setLength(0);
            
        }
        return p;
    }
}