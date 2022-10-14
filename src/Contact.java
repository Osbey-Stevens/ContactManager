
public class Contact{
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
//        this.phoneNumber = phoneNumber;
        if(phoneNumber.length() == 7){
        this.phoneNumber = insertString(phoneNumber,"-",2);
        }

        if(phoneNumber.length() == 10){
            phoneNumber = insertString(phoneNumber,"-",2);
            phoneNumber = insertString(phoneNumber,"-",6);
            this.phoneNumber = phoneNumber;
        }else{
            this.phoneNumber = phoneNumber;
        }

    }

    public static String insertString(
            String originalString,
            String stringToBeInserted,
            int index)
    {

        // Create a new string
        String newString = originalString.substring(0, index + 1)
                + stringToBeInserted
                + originalString.substring(index + 1);

        // return the modified String
        return newString;
    }
}