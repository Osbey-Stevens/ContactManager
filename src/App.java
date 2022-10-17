import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path contactsFile = Paths.get("data/contacts.txt");
        ContactFunctions test = new ContactFunctions();

//        System.out.println(test.getData(contactsFile));
        test.getData(contactsFile).forEach(System.out::println);


    }
}