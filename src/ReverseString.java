import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    private static String reverseString(String originalString) {

        char[] charArray = originalString.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }
}