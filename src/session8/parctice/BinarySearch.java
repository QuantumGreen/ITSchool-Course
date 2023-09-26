package session8.parctice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 9, 14, 26};
        int target = 5;

        int result = binarySearch(array,target);
        if(result != -1){
            System.out.println("found "+target+" at index "+result);
        } else {
            System.out.println(target+" not found");
        }
    }

    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length-1;

        while(left <= right){
            int middle = left + (right - left) / 2;
            if (array[middle] == target){
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
