import java.util.Scanner;

import utils.Contact;
import utils.ContactManager;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("================= Contact Manager ============== ");
        ContactManager listContacts = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        String option = null;
        do {
            printMenu();
            option = scanner.nextLine();
            if (option.equals("1")) {
               Contact newContact = createContact(scanner);
               listContacts.addContacts(newContact);
            } else if (option.equals("2")) {
                String email = removeContact(scanner);
                listContacts.removeContacts(email);
            } else if (option.equals("3")) {
                listContacts.showContacts();
            } else if (option.equals("4")) {
                String email = searchContact(scanner);
                listContacts.searchContacts(email);
            }

        } while (!option.equals("5"));

    }
    public static String searchContact(Scanner scanner) {
        System.out.println("Please insert the email of the user that you wanna search");
        String email = scanner.nextLine();
        return email;
    }
    public static String removeContact(Scanner scanner) {
        System.out.println("Please insert the email of the user that you wanna remove");
        String email = scanner.nextLine();
        return email;
    }
    public static Contact createContact(Scanner scanner) {
        System.out.println("Please Add the following data to create a new contact");
        System.out.println("Please insert the email");
        String email = scanner.nextLine();
        System.out.println("Please insert the name");
        String name = scanner.nextLine();
        System.out.println("Please insert the last name");
        String lastName = scanner.nextLine();
        return new Contact(email, name, lastName);
    }
    public static void printMenu() {
        System.out.println("1. Add Contact");
        System.out.println("2. Remove Contact");
        System.out.println("3. Show Contacts");
        System.out.println("4. Search Contact");
        System.out.println("5. Exit");
    }
}
