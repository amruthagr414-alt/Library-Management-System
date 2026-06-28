public class Main {

    public static void main(String[] args) {

        LibraryManager library = new LibraryManager();

        try {

            library.addBook(101, "Java Programming");
            library.addBook(102, "Data Structures");
            library.addBook(103, "Database Management");

            // Duplicate Book ID
            library.addBook(101, "Python Programming");

        } catch (DuplicateBookException e) {

            System.out.println("Custom Exception Caught!");
            System.out.println(e.getMessage());

        }

        // Add categories
        library.addCategory("Programming");
        library.addCategory("Database");
        library.addCategory("Programming"); // Duplicate ignored

        library.displayBooks();
        library.displayCategories();

        // Example of try-catch
        try {

            int result = 20 / 0;

        } catch (ArithmeticException e) {

            System.out.println("\nArithmetic Exception Handled!");
            System.out.println(e.getMessage());

        }

        System.out.println("\nProgram Executed Successfully.");

    }
}