// In selection sort instead of making unnecessary swap with every element we find out the smallest number in an array an usko direct first position pe swap kar denge. so alternate swap every element ka nahi hoga
// ek hi baar me smallest ko sabse saamne rakh denge and then fr same concept on baki ke bache hue list pe

public class selection_sort {
    public static void sortSelection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sortSelection(arr);
        printArray(arr);
    }
}
