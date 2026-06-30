import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,"Laptop","Electronics"),

                new Product(102,"Mouse","Electronics"),

                new Product(103,"Keyboard","Electronics"),

                new Product(104,"Printer","Electronics"),

                new Product(105,"Camera","Electronics")

        };

        System.out.println("Linear Search");

        Product result1 =
                SearchOperations.linearSearch(products,"Keyboard");

        if(result1 != null)

            System.out.println(result1);

        else

            System.out.println("Product Not Found");

        // Sort array before Binary Search
        Arrays.sort(products,
                Comparator.comparing(Product::getProductName));

        System.out.println();

        System.out.println("Binary Search");

        Product result2 =
                SearchOperations.binarySearch(products,"Keyboard");

        if(result2 != null)

            System.out.println(result2);

        else

            System.out.println("Product Not Found");

    }

}