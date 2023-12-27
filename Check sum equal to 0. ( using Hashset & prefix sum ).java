import java.util.*;

class Main {
    
    public static boolean SubarraywithsumZero(int[] arr) {
        int psum[] = new int[arr.length];
        psum[0] = arr[0];

        HashSet<Integer> set = new HashSet<>();
        set.add(psum[0]);

        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i - 1] + arr[i];

            if (psum[i] == 0 || set.contains(psum[i])) {
                return true;
            }

            set.add(psum[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int[] arr1 = {4, 2, 4, -3, 1, 6};
        System.out.println("Result " + SubarraywithsumZero(arr));
        System.out.println("Result " + SubarraywithsumZero(arr1));
    }
}
