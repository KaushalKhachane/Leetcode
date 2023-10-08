import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack2 {

    public static double fractionalKnapsack(Item arr[], int w) {
        // Sort the items based on value-to-weight ratio in descending order
        Arrays.sort(arr, new ItemComparator());

        double res = 0.0;

        for (int i = 0; i < arr.length && w > 0; i++) {
            if (arr[i].wt <= w) {
                res += arr[i].val;
                w -= arr[i].wt;
            } else {
                res += arr[i].val * ((double) w / arr[i].wt);
                w = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Item arr[] = {
            new Item(10, 60),
            new Item(40, 40),
            new Item(20, 100),
            new Item(30, 120)
        };

        int w = 50;
        System.out.println(fractionalKnapsack(arr, w));
    }
}

class Item {
    int wt, val;

    public Item(int wt, int val) {
        this.wt = wt;
        this.val = val;
    }
}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        // Calculate value-to-weight ratios for both items
        double ratio1 = (double) item1.val / item1.wt;
        double ratio2 = (double) item2.val / item2.wt;

        // Compare based on the value-to-weight ratio
        if (ratio1 < ratio2) {
            return 1;  // item2 should come before item1
        } else if (ratio1 > ratio2) {
            return -1; // item1 should come before item2
        } else {
            return 0;  // They have the same ratio
        }
    }
}
