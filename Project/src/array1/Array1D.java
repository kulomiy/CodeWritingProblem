package array1;

public class Array1D {
    public String getArrayInfo(int[] arr) {
        int sum = 0;
        String data = "";
        for (int i = 0; i < arr.length; i++) {
            data += arr[i];
            if (i < arr.length - 1)
                data += " ";
            sum += arr[i];
        }
        return data + "\nSum: " + sum;
    }
}
