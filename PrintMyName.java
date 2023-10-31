import java.util.Scanner;

public class PrintUserName {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.println("Please enter your name:");

        // Read the name from the user
        String name = scanner.nextLine();

        // Print the message with the user's name
        System.out.println("My name is " + name + ", I am Contributing in Hacktober Open Source Project.");

        scanner.close();
    }
}
