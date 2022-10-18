import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactFunctions{


    //View all contacts
    public static void viewContacts(List<String> contacts){
        Scanner scanner = new Scanner(System.in);

        contacts.forEach(System.out::println);
        System.out.println("Press enter to return to the main menu.");
        scanner.nextLine();
    }

    //Get data function
    public static List<String> getData(Path p){
        List<String> contacts = null;
        try{
            contacts = Files.readAllLines(p);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return contacts;
    }

    //Add contact to Arraylist
    public static void addContact(List<String> contacts) {
        Input input = new Input();

        String name = input.getString("Enter new contact first and last name: ");
        String phoneNumber = input.getString("Enter new contact phone number: ");

        Contact contact = new Contact(name,phoneNumber);

        String contactInfo = String.format("\n%s %s", contact.getName(), contact.getPhoneNumber());
        contacts.add(contactInfo);

        System.out.println("Contact has been added to the list!\n");
    }

    public static  void searchContact(List<String> contacts){
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

       String savedContact = input.getString("Which contact would you like more info on?");
//        System.out.println(savedContact);

        List<String> foundData = contacts.stream()
                .filter(e -> e.contains(savedContact))
                .collect(Collectors.toList());

        System.out.println("\nFound contacts:");
        foundData.forEach(System.out::println);

        System.out.println("Press enter to return to the main menu");
        scanner.nextLine();
    }

    public static List<String> deleteContact(List<String> contacts){
        Input input = new Input();
        String data = input.getString("Which user would you like to delete ? ");
        contacts.removeIf(e -> e.contains(data));
        return contacts;
    }


    public static void saveData(List<String> contacts, Path p){
        try{
            Files.write(p,contacts);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
