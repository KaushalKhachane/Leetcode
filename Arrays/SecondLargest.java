import java.util.Locale.LanguageRange;

public class SecondLargest {

    // find the index of largest element in array
    public static int greatest(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    // find the index of second largest element in array
    public static int secondGreatest(int arr[]) {
        int sLargest = -1;
        int largest = greatest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (sLargest == -1) {
                    sLargest = i;
                } else if (arr[i] > arr[sLargest]) {
                    sLargest = i;
                }
            }
        }
        return sLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 4, 50 };
        System.out.println("Largest Element Index: " + greatest(arr));
        System.out.println("Second Largest Element Index: " + secondGreatest(arr));
    }
}
