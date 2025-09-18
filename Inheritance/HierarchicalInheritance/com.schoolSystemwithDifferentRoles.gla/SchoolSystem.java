package com.schoolSystemwithDifferentRoles.gla;
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Mathematics");
        Student s = new Student("Bob", 16, "10th Grade");
        Staff st = new Staff("Charlie", 40, "Administration");
        t.displayRole();
        System.out.println("--------------------");
        s.displayRole();
        System.out.println("--------------------");
        st.displayRole();
    }
}