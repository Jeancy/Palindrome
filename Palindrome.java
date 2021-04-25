
// Java implementation of the approach 
public class Palindrome { 
  
    // Function that returns true if 
    // str is a palindrome 
  
    // A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
    static boolean isPalindrome(String str) 
    { 
  
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0;
        int j = str.length() - 1; 
  
        // While there are characters to compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
            // By the time i becomes greater than j it means we have managed to compare all element to each other respectively and beeing this far means the string is a palindrome
            if(i>j){
               return true;
            }
             
            i++; // Increment first pointer and
            j--; // decrement the other 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeks"; 
  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
       String str1 = "omo";
       if (isPalindrome(str1)) 
            System.out.print("Yes"); 
       else
            System.out.print("No"); 
       
} 
