import java.util.Arrays;
import java.util.Comparator;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101,"Java","James Gosling"),

                new Book(102,"Python","Guido van Rossum"),

                new Book(103,"DSA","Mark Allen Weiss"),

                new Book(104,"C++","Bjarne Stroustrup"),

                new Book(105,"Operating Systems","Galvin")

        };

        System.out.println("Linear Search\n");

        Book result1 =
                LibrarySearch.linearSearch(books,"DSA");

        if(result1 != null)

            System.out.println(result1);

        else

            System.out.println("Book Not Found");

        // Sort before Binary Search
        Arrays.sort(books,
                Comparator.comparing(Book::getTitle));

        System.out.println();

        System.out.println("Binary Search\n");

        Book result2 =
                LibrarySearch.binarySearch(books,"DSA");

        if(result2 != null)

            System.out.println(result2);

        else

            System.out.println("Book Not Found");

    }

}