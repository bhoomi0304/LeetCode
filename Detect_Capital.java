class Solution {
    public boolean detectCapitalUse(String word) {
        boolean frtcharec = false;
        int capcnt= 0;
        if(Character.isUpperCase(word.charAt(0))) 
             frtcharec = true;

        for(Character ch : word.toCharArray())
            if(Character.isUpperCase(ch))
                capcnt++;
        

        if(capcnt == word.length() || capcnt == 0) return true;
        if(capcnt == 1 && frtcharec) return true;
        return false;

    }
}
