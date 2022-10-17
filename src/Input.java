import java.util.Scanner;

public class Input{
    private Scanner scanner;

    //Class Constructor
    public Input(){
        this.scanner = new Scanner(System.in);
    }


    public String getString(String... prompt){
        String input;
        System.out.printf(prompt[0]);
        input =  scanner.nextLine();
//        System.out.printf("String entered: %s\n",input);
        return input;
    }
    public boolean yesNo(String... prompt){
        String userBool;
        boolean bool;
        System.out.printf(prompt[0]);
        userBool = scanner.nextLine();

        bool =  userBool.equalsIgnoreCase("y") || userBool.equalsIgnoreCase("yes");
//        System.out.printf("Boolean value: %b\n", bool);
        return bool;
    }
    public int getInt(int min, int max){
        System.out.printf("Enter a whole number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();

        while (userInput<min || userInput > max){
            System.out.printf("You must enter a number between %d and %d: ", min, max);
            userInput = scanner.nextInt();
            System.out.printf("\n");
        }

//        System.out.printf("You entered %d\n", userInput);
        return userInput;

    }
    public int getInt(String... prompt)throws Exception{
        String input;
        int intInput =-1;


        System.out.printf(prompt[0]);
        input = scanner.nextLine();
        intInput = Integer.valueOf(input);

        System.out.printf("You entered %d\n", intInput);
        return intInput;
    }
    public double getDouble(double min, double max){
        System.out.printf("Enter a decimal number between %.2f and %.2f: ", min, max);
        double userInput = scanner.nextDouble();

        while (userInput<min || userInput > max){
            System.out.printf("You must enter a number between %.2f and %.2f: ", min, max);
            userInput = scanner.nextDouble();
            System.out.printf("\n");
        }

        System.out.printf("You entered %.2f\n", userInput);
        return userInput;
    }
    public double getDouble(String... prompt){
        double input;
        System.out.printf(prompt[0]);
        input =  scanner.nextDouble();
//        System.out.printf("You entered %.2f\n", input);
        return input;
    }

//    public static void main(String[] args) {
//        Input input = new Input();
//        input.getDouble();
//    }
}
