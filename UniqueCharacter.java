/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

class Solution {
    public int firstUniqChar(String s) {
        
        int [] frequencies = new int [256];
        
        for (int i = 0; i < s.length(); i++){
            frequencies[s.charAt(i)]++;
            
        }
        
        for (int j = 0; j < s.length(); j++){
            if (frequencies[s.charAt(j)] == 1){
                return j;
            }
        }
        
        return -1;
        
    }
}