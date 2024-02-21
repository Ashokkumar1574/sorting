import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "hello";
        String sortedStr = sortString(str);
        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }

    public static String sortString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Reconstruct the string from the sorted character array
        return new String(charArray);
    }
}
