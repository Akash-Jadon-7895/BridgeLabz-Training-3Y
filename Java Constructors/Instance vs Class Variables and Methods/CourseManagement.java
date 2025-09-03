import java.util.*;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newInstitute = sc.nextLine();
        Course.updateInstituteName(newInstitute);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String cname = sc.nextLine();
            int duration = sc.nextInt();
            double fee = sc.nextDouble();
            sc.nextLine();
            Course c = new Course(cname, duration, fee);
            c.displayCourseDetails();
        }
    }
}
