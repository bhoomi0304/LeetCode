// Reversing a String 
class Solution {
    public void reverseString(char[] s) {
        
        char [] Temp=new char[s.length];
        int num= s.length;
        for(int x=0;x<s.length;x++){
            
            Temp[x]=s[num-x-1];
        }
       for(int y=0;y<num;y++){
            s[y]=Temp[y];
        }
    }
}
