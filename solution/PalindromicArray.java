
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }

    // helper function to check palindrome number
    private static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return original == rev;
    }
}
