
public class Strings_rev {
    public static void main(String[] args) {
        //String Operations
        String str = "Hello World";
        int len = str.length();           // Length
        char ch = str.charAt(0);          // Character at index
        String sub = str.substring(0, 5); // Substring
        String[] parts = str.split(" ");  // Split by delimiter
        String lower = str.toLowerCase(); // Convert to lowercase
        boolean contains = str.contains("Hello"); // Check substring

        
        //StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.reverse();
        String result = sb.toString();
    }
}
