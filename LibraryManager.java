import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LibraryManager {

    // ArrayList to store book titles
    private ArrayList<String> bookList = new ArrayList<>();

    // HashMap to store Book ID and Book Title
    private HashMap<Integer, String> bookMap = new HashMap<>();

    // HashSet to store unique book categories
    private HashSet<String> categorySet = new HashSet<>();

    // Add a book
    public void addBook(int id, String title) throws DuplicateBookException {

        if (bookMap.containsKey(id)) {
            throw new DuplicateBookException("Book ID already exists!");
        }

        bookMap.put(id, title);
        bookList.add(title);
    }

    // Add a category
    public void addCategory(String category) {
        categorySet.add(category);
    }

    // Display books
    public void displayBooks() {
        System.out.println("\n===== BOOK LIST =====");
        for (String book : bookList) {
            System.out.println(book);
        }

        System.out.println("\n===== BOOK MAP =====");
        for (Integer id : bookMap.keySet()) {
            System.out.println("Book ID: " + id + " | Title: " + bookMap.get(id));
        }
    }

    // Display categories
    public void displayCategories() {
        System.out.println("\n===== BOOK CATEGORIES =====");
        for (String category : categorySet) {
            System.out.println(category);
        }
    }
}