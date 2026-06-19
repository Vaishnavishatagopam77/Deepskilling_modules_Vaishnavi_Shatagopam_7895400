public class Main {

    static void display(Order[] arr) {
        for (Order o : arr)
            System.out.println(o);
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, "Asha", 3000),
            new Order(102, "Ravi", 1500),
            new Order(103, "Kiran", 5000),
            new Order(104, "Priya", 2500)
        };

        System.out.println("Before Sorting:");
        display(orders);

        // Bubble Sort (optional demo)
        bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        display(orders);

        // Quick Sort
        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        display(orders);
    }

    static void bubbleSort(Order[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].totalPrice > arr[j + 1].totalPrice) {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int partition(Order[] arr, int low, int high) {

        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].totalPrice < pivot) {
                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(Order[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}