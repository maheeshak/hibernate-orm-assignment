import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        mainPage();

    }
    private static void mainPage() {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 37; i++) {
            System.out.print("-");

        }
        System.out.print("\n");
        System.out.print("|");
        System.out.print("\t\tBooks Management System");
        System.out.println("\t\t|");

        for (int i = 0; i < 37; i++) {
            System.out.print("-");

        }

        System.out.println("");

        System.out.println("[01] Save Book");
        System.out.println("[02] Update Book");
        System.out.println("[03] View Book");
        System.out.println("[04] Remove Book");
        System.out.println("[05] Exit");

        System.out.println("");
        Integer option = 0;
        while (option != 5) {
            System.out.print("Please Select your option : ");
            try {
                option = input.nextInt();

                if (option == 1) {
                    saveBook();
                } else if (option == 2) {
                    updateBook();

                } else if (option == 3) {
                    viewBook();

                }  else if (option == 4) {
                    removeBook();

                } else if (option == 5) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }

            } catch (InputMismatchException exception) {
                System.out.println("Wrong Input :(");
                input.next(); // Consume the invalid input to avoid an infinite loop
                continue;
            }
        }


    }
}
