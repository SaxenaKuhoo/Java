import java.util.Scanner;

class Assign2 {
    public static void main(String[] args) {
        int n;
        int f = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            try {
                // a[i] = s.nextInt();
                String b = s.next();
                a[i] = Integer.parseInt(b);
            } catch (Exception e) {
                System.out.println(e);
                f = 1;
            }
        }
        if (f == 0) {
            System.out.println("Enetr index");
            int i;
            try {
                i = s.nextInt();
                System.out.println(a[i]);
                System.out.println("Succsessful");
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                s.close();
            }
        }
    }
}
