import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = s.nextInt();
        int a[] = new int[2];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            try
            {
            a[i] = s.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Enetr index");
        int i;
        i = s.nextInt();
        try {
            System.out.println(a[i]);
            System.out.println("Succsessful");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
