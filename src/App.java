import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Path contactsFile = Paths.get("data/contacts.txt");
        List<String> contacts = new ArrayList<>();


        contacts = ContactFunctions.getData(contactsFile);
        boolean userContinue = true;

        //Start Program loop
        while (userContinue) {
            userContinue = executeOption(displayOptions(), contacts,contactsFile);
        }
    }

    public static int displayOptions() {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        System.out.printf("\nWhat would you like to do?\n" +
                "\n" +
                "1 - View contacts\n" +
                "2 - Add a new contact\n" +
                "3 - Search a contact by name\n" +
                "4 - Delete an existing contact\n" +
                "5 - Exit\n" +
                "\n" +
                "Enter your choice (1, 2, 3, 4 or 5): ");

        userInput = scanner.nextInt();
        while (userInput < 0 || userInput > 5) {
            System.out.println("You must enter a number between 1-5:");
            userInput = scanner.nextInt();
        }

        return userInput;
    }

    public static boolean executeOption(int choice, List<String> contacts,Path p) {

        switch (choice) {
            case 1:
                ContactFunctions.viewContacts(contacts);
                return true;
//                break;
            case 2:
                ContactFunctions.addContact(contacts);
                return true;
//                break;
            case 3:
                ContactFunctions.searchContact(contacts);
                return true;
//                break;
            case 4:
                contacts = ContactFunctions.deleteContact(contacts);
                return true;
//                break;
            case 5:
                System.out.println("Thanks for using our contact manager");
                ContactFunctions.saveData(contacts,p);
                return false;
//                break;
        }
        System.out.println("Option selection was not processed correctly");
        return false;
    }
}