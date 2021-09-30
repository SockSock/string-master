import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class NameMaster {

    Scanner scanner = new Scanner(System.in);

    public void getFullName() {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Hello " + firstName + " " + lastName + ".");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void getNameLength() {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        int firstNameLength = firstName.length();

        System.out.println("The length of your name is " + firstNameLength + ".");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void passwordChecker() {
        while (true) {

            System.out.print("Enter the password: ");
            String password = scanner.nextLine();

            if (!(password.equals("password"))) {
                System.out.println("Wrong password.");
            } else {
                System.out.println("Correct password.");
                break;
            }
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void onlyLastName() {
        System.out.print("Enter your full name (not including middle name): ");
        String fullName = scanner.nextLine();

        int length = fullName.indexOf(' ');
        String lastName = fullName.substring(length + 1);

        System.out.println("Hello " + lastName + ".");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void onlyInitials() {
        System.out.print("Enter your full name, including your middle name: ");
        String fullName = scanner.nextLine();

        int length = fullName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(fullName.charAt(i))) {
                char initials = fullName.charAt(i);
                System.out.print(initials);
            }
        }

        System.out.println("");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void sayingWordCount() {
        int count = 0;

        System.out.print("Enter the saying: ");
        String saying = scanner.nextLine();

        int length = saying.length();

        for (int i = 0; i < length; i++) {
            if (Character.isSpaceChar(saying.charAt(i))) {
                count++;
            }
        }

        System.out.println(count + 1);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void inReverse() {
        System.out.print("Write something: ");
        String phrase = scanner.nextLine();

        int length = phrase.length();

        for (int i = length - 1; i >= 0; i--) {
            char reverseCharacter = phrase.charAt(i);
            System.out.print(reverseCharacter);
        }

        System.out.println("");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void vowelsAndConsonantsChecker() {
        int vowelCount = 0;
        int consonantCount = 0;

        System.out.print("Write something: ");
        String phrase = scanner.nextLine();

        int length = phrase.length();

        for (int i = 0; i < length; i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u'
                    || phrase.charAt(i) == 'A' || phrase.charAt(i) == 'E' || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'O' || phrase.charAt(i) == 'U') {
                vowelCount++;
            }
            else if (phrase.charAt(i) == ' ') {

            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }

    public void hangman() {
        StringBuilder result = new StringBuilder();

        while (true) {
            System.out.print("Try and guess the six-lettered word: ");
            String guess = scanner.nextLine();

            if (guess.length() != 6) {
                System.out.println("Invalid input.");

            } else {
                guess = guess.toUpperCase();

                for (int i = 0; i < guess.length(); i++) {
                    if (i == 0) {
                        if (guess.charAt(i) == 'R') {
                            result.append('R');
                        } else {
                            result.append('?');
                        }
                    }
                    if (i == 1) {
                        if (guess.charAt(i) == 'A') {
                            result.append('A');
                        } else {
                            result.append('?');
                        }
                    }
                    if (i == 2) {
                        if (guess.charAt(i) == 'N') {
                            result.append('N');
                        } else {
                            result.append('?');
                        }
                    }
                    if (i == 3) {
                        if (guess.charAt(i) == 'D') {
                            result.append('D');
                        } else {
                            result.append('?');
                        }
                    }
                    if (i == 4) {
                        if (guess.charAt(i) == 'O') {
                            result.append('O');
                        } else {
                            result.append('?');
                        }
                    }
                    if (i == 5) {
                        if (guess.charAt(i) == 'M') {
                            result.append('M');
                        } else {
                            result.append('?');
                        }
                    }
                }

                if (result.toString().equals("RANDOM")) {
                    System.out.println("Congratulations! You have guessed the word! It is 'RANDOM'!");

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        System.out.println("There has been an Interrupted Exception error.");
                    }

                    break;

                } else {
                    System.out.println("Not quite. Check output: " + result);
                    result = new StringBuilder();
                }
            }
        }
    }

    public void caesarCipher() { // Doesn't work.

        ArrayList<Character> alphabet = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }

        System.out.print("Enter a phrase: ");
        StringBuilder phrase = new StringBuilder(scanner.nextLine());

        System.out.print("Enter how many shifts you want: ");
        int shifts = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < alphabet.size(); j++) {
                if (alphabet.get(j).equals(phrase.charAt(i))) {
                    phrase.setCharAt(i, alphabet.get(j + shifts));
                    break;
                }
            }
        }

        System.out.println(phrase);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("There has been an Interrupted Exception error.");
        }
    }
}
