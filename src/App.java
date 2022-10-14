import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path contactsFile = Paths.get("data/contacts.txt");
        List<String> contacts = new ArrayList<>();

        ContactFunctions.addContact(contacts,new Contact("Bobo","2288772980"));
        contacts.forEach(System.out::println);

//        contacts = ContactFunctions.getData(contactsFile);
//        contacts.forEach(System.out::println);




    }
}