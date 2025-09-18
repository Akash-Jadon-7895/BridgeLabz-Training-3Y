package com.educationalCourseHierarchy.gla;
public class CourseSystem {
    public static void main(String[] args) {
        Course c1 = new Course("C++ Basics", 6);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Full Stack Development", 12, "Coursera", true, 500, 20);
        c1.displayInfo();
        System.out.println("------------------");
        c2.displayInfo();
        System.out.println("------------------");
        c3.displayInfo();
    }
}