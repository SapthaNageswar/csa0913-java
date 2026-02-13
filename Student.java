class Student {
    int regNo;
    String name;
    int mark1, mark2, mark3;

    Student(int r, String n, int m1, int m2, int m3) {
        regNo = r;
        name = n;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    String getResult() {
        if (calculateAverage() >= 50)
            return "Pass";
        else
            return "Fail";
    }

    void display() {
        System.out.println("Register No: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + getResult());
        System.out.println("---------------------");
    }
}

public class void main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Arun", 60, 55, 70);
        Student s2 = new Student(102, "Priya", 40, 45, 50);

        s1.display();
        s2.display();
    }
}