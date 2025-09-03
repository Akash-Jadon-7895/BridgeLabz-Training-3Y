public class Person {
    int height;
    int weight;
    String gender;
    Person(int height, int weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
    Person(Person person) {
        this.height = person.height;
        this.weight = person.weight;
        this.gender = person.gender;
    }
    public static void main(String[] args) {
        Person person1 = new Person(180, 75, "male");
        Person person2 = new Person(person1);   
        System.out.println("Person 1: " + person1.height + ", " + person1.weight + ", " + person1.gender);
        System.out.println("Person 2: " + person2.height + ", " + person2.weight + ", " + person2.gender);
    }
}
