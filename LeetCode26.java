import java.util.*;

public class LeetCode26 {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,3};

        Arrays.sort(a); // 🔥 IMPORTANT

        int i=0;
        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {
                i++;
                a[i] = a[j];
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Unique count: " + (i+1));
    }
}