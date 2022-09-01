import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {

        int[] A = new int[10];
        A[0] = 30;
        A[1] = 5;
        A[2] = 6;
        A[3] = 9;
        A[4] = 2;
        A[5] = 1;
        A[6] = 50;
        A[7] = 0;
        A[8] = 66;
        A[9] = 33;

        Arrays.sort(A);
        System.out.print("Array A = ");
        System.out.print(Arrays.toString(A));

        System.out.println();

        int[] B = new int[10];
        B[0] = 0;

        int in = A.length;
        //int out = B.length;

        int[] result = new int[in + 1];

        System.arraycopy(A, 0, result, 0, in);
        System.arraycopy(B, 0, result, in, 0);

        Arrays.sort(result);
        System.out.print("Array B = ");
        System.out.print(Arrays.toString(result));
    }
}
// Array A = [0, 1, 2, 5, 6, 9, 30, 33, 50, 66]
// Array B = [0, 0, 1, 2, 5, 6, 9, 30, 33, 50, 66]