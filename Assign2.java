import java.util.Scanner;

class Assign2 {
    public static void main(String[] args) {
        int n;
        int a[] = new int[2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = s.nextInt();
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enetr index");
        int i;
        i = s.nextInt();
        try {
            System.out.println(a[i]);
            System.out.println("Succsessful");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}