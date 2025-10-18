package array1;

public class Array1D {
    public String getArrayInfo(int[] array) {
        String result = "";
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            if (i < array.length - 1) {
                result = result + " ";
            }
            sum += array[i];
        }

        result = result + "\nSum: " + sum;
        return result;
    }
}
