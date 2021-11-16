import java.util.Scanner;

public class Glafee {
    double fee, fd, levy, sports, d;

    public double calcfee() {
        if (fee >= 50000) {
            if (fd >= fee / 2) {
                d = 0.05 * fee;
            }
            levy = 0.1 * fee;
            sports = 0.05 * fee;
            fee = fee - d + levy + sports;
        }
        return fee;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Glafee obj = new Glafee();
        System.out.println("Enter Original fee > 50000 :");
        obj.fee = s.nextInt();
        System.out.println("Enter amount to deposit >10000 :");
        obj.fd = s.nextInt();
        System.out.println("total fee to be paid : " + obj.calcfee());
        s.close();
    }
}