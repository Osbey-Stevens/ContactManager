import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Path contactsFile = Paths.get("data/contacts.txt");
        ContactFunctions test = new ContactFunctions();

        executeOption(displayOptions());


    }

    public static int displayOptions(){
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
                "Enter your choice: ");

        userInput = scanner.nextInt();
        while(userInput < 0 || userInput > 5){
            System.out.println("You must enter a number between 1-5:");
            userInput = scanner.nextInt();
        }

        return userInput;
    }

    public static void executeOption(int choice){

        switch (choice){
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
            case 4:
                System.out.println("Option 4");
                break;
            case 5:
                System.out.println("Option 5");
                break;
        }

    }
}