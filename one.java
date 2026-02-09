import java.util.*;

public class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("enter number of elements to be sifted:");
        int s = sc.nextInt();
        s = s % n;

        int sorted[] = new int[n];
        for(int i = 0; i < n; i++) {
            sorted[(i + s) % n] = a[i];
        }
        System.out.println("sifted array is:");
        for(int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

}
