class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        String b="";
        s = s.toLowerCase();
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);

        if(Character.isLetterOrDigit(c)){
            a+=c;
        }
     }   
     for(int i=a.length()-1;i>=0;i--){
        b+=a.charAt(i);
     }
     if(a.equals(b)){
        return true;
     }
    
    return false;
    }
}