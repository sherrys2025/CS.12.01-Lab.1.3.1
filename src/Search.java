import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(string)) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (array[mid].equals(string)) {
                return mid;
            } else if (array[mid].compareTo(string) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
}
