

public class MergeSort {

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2; // s+e/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // inx for first sorted part
        int j = mid+1; // inx for second sorted part
        int k = 0; // fot temp array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];            
        }
        while (j <= ei) {
            temp[k++] = arr[j++];            
        }

        //copy temp array to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        printArray(arr);
        mergeSort(arr, 0, arr.length-1  );
        printArray(arr);
    }
}
