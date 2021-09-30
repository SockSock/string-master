import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        NameMaster nameMaster = new NameMaster();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Get your full name back.");
            System.out.println("2. Get the length of your first name back.");
            System.out.println("3. Enter the correct password.");
            System.out.println("4. Only print your last name.");
            System.out.println("5. Get your initials only.");
            System.out.println("6. Get the word count from your saying.");
            System.out.println("7. Get your phrase in reverse.");
            System.out.println("8. Get the number of vowels and consonants in your phrase.");
            System.out.println("9. Game: Guess the correct word.");
            System.out.println("10. Cipher your phrase using Caesar Cipher.");
            System.out.println("11. Quit.");
            
            System.out.print("Enter your option: ");

            int option = Integer.valueOf(scanner.nextLine());

            if (option == 1) {
                nameMaster.getFullName();
            }
            if (option == 2) {
                nameMaster.getNameLength();
            }
            if (option == 3) {
                nameMaster.passwordChecker();
            }
            if (option == 4) {
                nameMaster.onlyLastName();
            }
            if (option == 5) {
                nameMaster.onlyInitials();
            }
            if (option == 6) {
                nameMaster.sayingWordCount();
            }
            if (option == 7) {
                nameMaster.inReverse();
            }
            if (option == 8) {
                nameMaster.vowelsAndConsonantsChecker();
            }
            if (option == 9) {
                nameMaster.hangman();
            }
            if (option == 10) {
                nameMaster.caesarCipher(); // Doesn't work.
            }
            if (option == 11) {
                System.out.println("Bye.");
                break;
            }
        }
    }
}
