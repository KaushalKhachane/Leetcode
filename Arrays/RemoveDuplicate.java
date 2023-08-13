public class RemoveDuplicate {
    public static int removeDuplicate(int arr[]) {
        int res = 1;
        int temp[] = new int[arr.length];
        temp[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != temp[res - 1]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 20, 20, 20, 30, 30, 30, 30 };
        System.out.println("Size without dupicate element: " + removeDuplicate(arr));
    }
}
