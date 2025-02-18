package lab6.Task06;
public class Class06 {
    private static int [] array_new;
    public static int [] newArrayArgument(int [] intArray, int new_length) {
        int length;
        if (intArray.length < new_length) {
            length = intArray.length;
        } else {
            length = new_length;
        }
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = intArray[i];
        }
        array_new = newArray;
        return array_new;
    }
}