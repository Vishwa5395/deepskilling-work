public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101,"Laptop",10,55000);

        Product p2 = new Product(102,"Mouse",50,700);

        Product p3 = new Product(103,"Keyboard",30,1200);

        inventory.addProduct(p1);

        inventory.addProduct(p2);

        inventory.addProduct(p3);

        inventory.displayProducts();

        System.out.println();

        inventory.updateProduct(102,60,650);

        inventory.displayProducts();

        System.out.println();

        inventory.deleteProduct(101);

        inventory.displayProducts();

    }

}