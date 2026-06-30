class Book1 {

    int bookId;
    String title;
    String author;

    public Book1(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("----------------------");
    }
}

public class LibraryManagementSystem {

    // Linear Search
    public static Book1 linearSearch(Book1[] books, String targetTitle) {

        for (Book1 book : books) {

            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }

        return null;
    }

    // Binary Search
    public static Book1 binarySearch(Book1[] books, String targetTitle) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                    books[mid].title.compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            }

            else if (comparison < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Sorted array for Binary Search
        Book1[] books = {

                new Book1(101,
                        "C Programming",
                        "Dennis Ritchie"),

                new Book1(102,
                        "Data Structures",
                        "Mark Allen"),

                new Book1(103,
                        "Java Programming",
                        "James Gosling"),

                new Book1(104,
                        "Operating Systems",
                        "Galvin"),

                new Book1(105,
                        "Python Basics",
                        "Guido Van Rossum")
        };

        System.out.println("LINEAR SEARCH");

        Book1 result1 =
                linearSearch(books, "Java Programming");
        if (result1 != null) {
            result1.display();
        }
        else {
            System.out.println("Book Not Found");
        }
        System.out.println("\nBINARY SEARCH");
        Book1 result2 =
                binarySearch(books, "Java Programming");
        if (result2 != null) {
            result2.display();
        }
        else {
            System.out.println("Book Not Found");
        }
    }
}