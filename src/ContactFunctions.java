import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactFunctions{


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
    public static void addContact(List<String> contacts, Contact contact) {
        String contactInfo = String.format("\n%s %s", contact.getName(), contact.getPhoneNumber());
        contacts.add(contactInfo);
    }
}
