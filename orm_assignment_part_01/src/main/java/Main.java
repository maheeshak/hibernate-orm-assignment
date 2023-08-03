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

                } else if (option == 4) {
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
        private static void saveBook () {
            Scanner input = new Scanner(System.in);
            Integer option = 0;
            while (option != -1) {

                for (int i = 0; i < 25; i++) {
                    System.out.print("-");

                }
                System.out.print("\n");
                System.out.print("|");
                System.out.print("\t\tSave Book");
                System.out.println("\t\t|");

                for (int i = 0; i < 25; i++) {
                    System.out.print("-");
                }

                System.out.println("");


                System.out.println("[01] Add Book");
                System.out.println("[02] Main Page");
                System.out.println("");
                System.out.print("Please Select your option : ");
                option = input.nextInt();
                if (option == 1) {

                    input.nextLine();
                    System.out.print("Book ID : ");
                    String book_id = input.nextLine();

                    System.out.print("Book Title : ");
                    String book_title = input.nextLine();

                    System.out.print("Book ISBN : ");
                    String book_isbn = input.nextLine();


                    Book book = new Book(book_id, book_title, book_isbn);

                    Boolean isValid = crudOperations(book, "isValid");
                    if (isValid) {

                        Boolean isSaved = crudOperations(book, "save");
                        System.out.println("Book is Added !!!");
                        System.out.println("");
                    } else {
                        System.out.println("Book ID is Already Added !!!");
                        System.out.println("");
                    }
                } else {
                    mainPage();
                }
            }

        }

    }
    private static void updateBook() {
        Scanner input = new Scanner(System.in);
        Integer option = 0;
        while (option != -1) {

            for (int i = 0; i < 25; i++) {
                System.out.print("-");

            }
            System.out.print("\n");
            System.out.print("|");
            System.out.print("\t\tUpdate Book");
            System.out.println("\t\t|");

            for (int i = 0; i < 25; i++) {
                System.out.print("-");
            }

            System.out.println("");


            System.out.println("[01] Update Book");
            System.out.println("[02] Main Page");
            System.out.println("");
            System.out.print("Please Select your option : ");
            option = input.nextInt();
            if (option == 1) {
                input.nextLine();
                System.out.print("Enter Book ID : ");
                String book_id_new = input.nextLine();
                Book book1 = new Book(book_id_new, "", "");
                Boolean isValid1 = crudOperations(book1, "isValid");

                if (!isValid1) {

                    System.out.print("Book Title : ");
                    String book_title = input.nextLine();

                    System.out.print("Book ISBN : ");
                    String book_isbn = input.nextLine();


                    Book book = new Book(book_id_new, book_title, book_isbn);


                    Boolean isSaved = crudOperations(book, "update");
                    if (isSaved) {
                        System.out.println("Book is Updated !!!");
                        System.out.println("");
                    }
                }
            } else {
                mainPage();
            }

        }


    }
    private static void viewBook() {
        Scanner input = new Scanner(System.in);
        Integer option = 0;
        while (option != -1) {

            for (int i = 0; i < 25; i++) {
                System.out.print("-");

            }
            System.out.print("\n");
            System.out.print("|");
            System.out.print("\t\tView Book");
            System.out.println("\t\t|");

            for (int i = 0; i < 25; i++) {
                System.out.print("-");
            }

            System.out.println("");


            System.out.println("[01] View Book");
            System.out.println("[02] Main Page");
            System.out.println("");
            System.out.print("Please Select your option : ");
            option = input.nextInt();
            if (option == 1) {

                input.nextLine();
                System.out.print("Book ID : ");
                String book_id = input.nextLine();

                Book book = new Book(book_id, "", "");

                Boolean isValid = crudOperations(book, "isValid");
                if (!isValid) {

                    Boolean isSaved = crudOperations(book, "view");
                    System.out.println("");
                }else {
                    System.out.println("Invalid ID");
                }
            } else {
                mainPage();
            }
        }


    }
}
