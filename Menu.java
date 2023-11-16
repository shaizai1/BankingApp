import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
            System.out.println("Welcome to the Banking App!");
            
            System.out.println("Banking Menu");
            System.out.println("Select an option from the following:");
            System.out.println("1. Manage an existing account");
            System.out.println("2. Create a new account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = menu.nextInt();

            switch (choice) {
                case 1:
                    createNewAccount();
                    break;
                case 2:
                    manageExistingAccount();
                    break;
                case 3:
                    System.out.println("Thank you for using the Banking App. Goodbye!");
                    menu.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }

            
        
        }

        
    
    
    private static void createNewAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of account to create:");
        System.out.println("1. Small Business Account");
        System.out.println("2. Community Account");
        System.out.println("3. Client Account");
        System.out.print("Enter your choice (1/2/3): ");

        int accountType = scanner.nextInt();

        switch (accountType) {
            case 1:
                System.out.println("Creating a Small Business Account...");
                
                break;
            case 2:
                System.out.println("Creating a Community Account...");
                
                break;
            case 3:
                System.out.println("Creating a Client Account...");
                
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }
    }

    private static void manageExistingAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhich type of account would you like to manage?");
        System.out.println("1. Small Business Account");
        System.out.println("2. Community Account");
        System.out.println("3. Client Account");
        System.out.print("Enter your choice (1/2/3): ");

        int accountType = scanner.nextInt();

        switch (accountType) {
            case 1:
                System.out.println("Managing a Small Business Account...");
                
                break;
            case 2:
                System.out.println("Managing a Community Account...");
                
                break;
            case 3:
                System.out.println("Managing a Client Account...");
                
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }
    }
}


