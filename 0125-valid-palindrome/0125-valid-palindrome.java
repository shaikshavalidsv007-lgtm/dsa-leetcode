class Solution {
    public boolean isPalindrome(String s) {

        String str = s.toLowerCase(); int left = 0; int right  = s.length()-1;

        while(left<right){
            
            if(!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }else {
                if(str.charAt(left)!=str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;        
    }


    
    public boolean isPalindrome_improvised(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (l != r) return false;
                left++;
                right--;
            }
        }
        return true;
    }

}