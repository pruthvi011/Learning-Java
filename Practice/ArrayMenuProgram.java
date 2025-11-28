import java.util.Scanner;

class InvalidArraySizeException extends Exception {
    public InvalidArraySizeException(String message) {
        super(message);
    }
}

public class ArrayMenuProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;

        try {
            System.out.print("Enter size of array: ");
            size = sc.nextInt();

            if (size <= 0) {
                throw new InvalidArraySizeException("Array size must be greater than 0.");
            }

        } catch (InvalidArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter only integers.");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Find the largest element");
            System.out.println("3. Calculate sum of elements");
            System.out.println("4. Search for an element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int val : arr) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int val : arr) {
                        if (val > max)
                            max = val;
                    }
                    System.out.println("Largest element: " + max);
                    break;

                case 3:
                    int sum = 0;
                    for (int val : arr) {
                        sum += val;
                    }
                    System.out.println("Sum of elements: " + sum);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int target = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == target) {
                            System.out.println("Element found at position: " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Enter 1–5 only.");
            }

        } while (choice != 5);

        sc.close();
    }
}
