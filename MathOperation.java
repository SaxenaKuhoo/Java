public class MathOperation {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                a[i] = Integer.parseInt(args[i]);
                sum = sum + a[i];
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Sum =" + sum);
        System.out.println("Average = " + sum / 5);
    }
}