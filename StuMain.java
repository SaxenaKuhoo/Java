import java.util.Scanner;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String str) {
        super(str);
    }
}

class Student {
    private String name;
    private int rollno;
    private double cpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollno=" + rollno + ", cpi=" + cpi + '}';
    }
}

class StuMain {

    public Student search(Student[] arr, int rollno) throws InvalidStudentException {
        Student response = null;
        for (Student student : arr) {
            if (student.getRollno() == rollno) {
                response = student;
                break;
            }
        }
        if (response == null) {
            throw new InvalidStudentException("student not found");
        } else
            return response;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int size = sc.nextInt();
        sc.nextLine();
        Student arr[] = new Student[size];
        System.out.println("Enter the list of students");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.println("Enter the name of " + i + " Student");
            arr[i].setName(sc.nextLine());
            System.out.println("Enter the rollno of " + i + " Student");
            arr[i].setRollno(sc.nextInt());
            System.out.println("Enter the cpi of " + i + " Student");
            arr[i].setCpi(sc.nextDouble());
            sc.nextLine();
        }
        try {
            StuMain obj = new StuMain();
            System.out.println("Enter roll no to get student result");
            System.out.println(obj.search(arr, sc.nextInt()));
        } catch (InvalidStudentException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}