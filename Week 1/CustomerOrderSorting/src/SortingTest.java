public class SortingTest {

    public static void main(String[] args) {

        Order[] orders1 = {

                new Order(101,"Rahul",55000),

                new Order(102,"Amit",700),

                new Order(103,"Riya",12000),

                new Order(104,"Sneha",1500)

        };

        System.out.println("Bubble Sort\n");

        Sorting.bubbleSort(orders1);

        Sorting.display(orders1);

        System.out.println();

        Order[] orders2 = {

                new Order(101,"Rahul",55000),

                new Order(102,"Amit",700),

                new Order(103,"Riya",12000),

                new Order(104,"Sneha",1500)

        };

        System.out.println("Quick Sort\n");

        Sorting.quickSort(orders2,0,orders2.length-1);

        Sorting.display(orders2);

    }

}