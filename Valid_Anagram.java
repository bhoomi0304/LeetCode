class Solution {
    public boolean isAnagram(String s, String t) {
        int[] temp=new int[26];
        for(int i=0;i<s.length();i++){
            temp[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            temp[t.charAt(i)-'a']--;
        }
        for(int i: temp){
            if(i!=0){
                return false;
            }
            
            
        }
        return true;
    }
}
