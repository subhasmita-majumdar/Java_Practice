import java.util.Arrays;

public class SortingNumericList
{
    public static void main(String args[]) {
        int intNumArr[] = {5, 2, 8, 1, 3, 0, 8};
        int n = intNumArr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (intNumArr[i] > intNumArr[j]) {
                    int temp = intNumArr[i];
                    intNumArr[i] = intNumArr[j];
                    intNumArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intNumArr));
    }
}
