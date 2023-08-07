
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        // Using recursion, we can set up the 2 base cases first:
        if(str.length() <= 1) { //  BASE CASE 1: if the string is one character or less...
            return true; // ...return true.
        } else if(str.charAt(0) != str.charAt(str.length() - 1)) { // BASE CASE 2: if the two endpoint characters are different...
            return false; // ...return false.
        } else {
            // If we get to this point, we know that the two endpoint characters are at least the same.
            // We can retrieve the substring between them, and recursively call pal() to check if the
            // substring is a palindrome, till we get to a base case.
            return pal(str.substring(1, str.length() - 1));
        }
    }
}
