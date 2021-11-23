/*Create a thread which prints 1 to 10.
After printing 5, there should be a delay of 5000 milliseconds before printing 6.
( Thread Control Mechanism concept)
*/
    class MyNumber implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i == 6) {
                    Thread.sleep(5000);
                }
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception..." + e);
        }
    }
}

class Number {
    public static void main(String[] args) {
        MyNumber m1 = new MyNumber();
        Thread thread = new Thread(m1);
        thread.start();
    }
}
