import java.util.Scanner;

public class operation_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main string:");
        String str = sc.nextLine();

        System.out.println("Enter choice");
        System.out.println("1. Change case of string");
        System.out.println("2. Reverse the string");
        System.out.println("3. Compare two strings");
        System.out.println("4. Insert one string into another");
        System.out.println("5. Convert to upper and lower case");
        System.out.println("6. Check character presence and position");
        System.out.println("7. Check palindrome");
        System.out.println("8. Count words, vowels and consonants");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                String changed = "";
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (Character.isUpperCase(ch))
                        changed += Character.toLowerCase(ch);
                    else
                        changed += Character.toUpperCase(ch);
                }
                System.out.println("Changed Case: " + changed);
                break;

            case 2:
                String reversed = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }
                System.out.println("Reversed String: " + reversed);
                break;

            case 3:
                System.out.println("Enter second string:");
                String str2 = sc.nextLine();
                if (str.equals(str2))
                    System.out.println("Strings are Equal");
                else
                    System.out.println("Strings are Not Equal");
                break;
            case 4:
                System.out.println("Enter string to insert:");
                String insert = sc.nextLine();
                System.out.println("Enter position:");
                int pos = sc.nextInt();

                String result = str.substring(0, pos) + insert + str.substring(pos);
                System.out.println("After Insertion: " + result);
                break;

            case 5:
                System.out.println("Upper Case: " + str.toUpperCase());
                System.out.println("Lower Case: " + str.toLowerCase());
                break;

            case 6:
                System.out.println("Enter character to search:");
                char ch = sc.next().charAt(0);
                int index = str.indexOf(ch);

                if (index != -1)
                    System.out.println("Character found at position: " + (index + 1));
                else
                    System.out.println("Character not found");
                break;

            case 7:
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev += str.charAt(i);
                }

                if (str.equals(rev))
                    System.out.println("String is Palindrome");
                else
                    System.out.println("String is Not Palindrome");
                break;

            case 8:
                int vowels = 0, consonants = 0, words = 0;

                String lower = str.toLowerCase();

                for (int i = 0; i < lower.length(); i++) {
                    char c = lower.charAt(i);

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        vowels++;
                    else if (c >= 'a' && c <= 'z')
                        consonants++;
                }

                words = str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;

                System.out.println("Words: " + words);
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
