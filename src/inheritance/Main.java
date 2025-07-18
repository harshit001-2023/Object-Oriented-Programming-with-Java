public class Main {
    public static void main(String[] args) {
        Headmaster h = new Headmaster("Mr. Sharma", "Admin", 20);
        h.showRole();

        System.out.println("-----------------");

        Teacher t = new Teacher("Ms. Neha", "Science", "Physics");
        t.showRole();

        System.out.println("-----------------");

        Student s = new Student("Rahul", "Science", 1023);
        s.showRole();
    }
}
