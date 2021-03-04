package junits;

public class StringFunctions {
	public static  boolean isPalindrome(String str) {
		
		int i =0;
		int j = str.length() - 1;
		while(i<j) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}	
		return true;
	}

//}

//public static boolean isPalindrome(String str) {
//    
//    
//    int i = 0;
//            
//    int j = str.length() - 1; 
//
//    // While there are characters toc compare 
//    while (i < j) { 
//
//        // If there is a mismatch 
//        if (str.charAt(i) != str.charAt(j)) {
//            return false;
//        }
//             
//
//        // Increment first pointer and 
//        // decrement the other 
//        i++; 
//        j--; 
//    } 
//
//    // Given string is a palindrome 
//    return true; 
//    
//}
}
