package Record.Problem3;

/*Develop a scenario based program for an education institute course enrollment System. The system should provide courses and offers to students, allowing them to view available courses, ongoing offers, and enroll in their preferred courses.

Classes:
Take one record class Course
Components :
-> id (Integer): Unique identifier for the course.
-> name (String): Name of the course.
-> fee (Double): Fee for the course.



Take another record Offer:
Components :
-> offerText (String): Description of the special offer provided by the education institute.


Take another record EducationInstitute:
Components:
-> courses (Course[]): An array to store the available courses.
-> offers (Offer[]): An array to store ongoing offers.

Methods:
-> public void enrollStudentInCourse(int courseId, String studentName): Using this method
   student will enrolled in the course based on courseId [See the Test Case]. If the given
   courseId is not available then provide error message.


Take another record Student:

Components:
-> String name
-> EducationInstitute institute

Methods:
1)
Method Name        : viewCoursesAndFees()
Parameter          : No Parameter
Return Type        : void
Access modifier    : public
In this method display all the courses information for student like course id, name and
fees.

2)
Method Name        : viewOffers()
Parameter          : No Parameter
Return Type        : void
Access modifier    : public
In this method display all the available offers provided by the institute for the course.


3)
Method Name        : enrollInCourse()
Parameter          : courseId of type integer
Return Type        : void
Access modifier    : public
In this method write the logic so, student can take admission in the course based on the
courseId*/

// Record for Course
record Course(Integer id, String name, Double fee) {
    // Compact constructor (no need to write explicitly)
}

// Record for Offer
record Offer(String offerText) {
    // Compact constructor
}

// Record for EducationInstitute
record EducationInstitute(Course[] courses, Offer[] offers) {

    // Method to enroll student in a course based on courseId
    public void enrollStudentInCourse(int courseId, String studentName) {
        boolean courseFound = false;

        for (Course course : courses) {
            if (course.id() == courseId) {
                courseFound = true;
                System.out.println("Enrolling " + studentName + " in course: " + course.name());
                System.out.println("Course enrollment confirmed!");
                break;
            }
        }

        if (!courseFound) {
            System.out.println("Error: Course with ID " + courseId + " not found.");
        }
    }
}

// Record for Student
record Student(String name, EducationInstitute institute) {

    // Method to view all courses and fees
    public void viewCoursesAndFees() {
        System.out.println("Available Courses:");
        Course[] courses = institute.courses();

        for (Course course : courses) {
            System.out.println(course.id() + ". " + course.name() + " - Fee: Rs." + course.fee());
        }
    }

    // Method to view all offers
    public void viewOffers() {
        System.out.println("Ongoing Offers:");
        Offer[] offers = institute.offers();

        for (Offer offer : offers) {
            System.out.println("- " + offer.offerText());
        }
    }

    // Method to enroll in a course
    public void enrollInCourse(int courseId) {
        institute.enrollStudentInCourse(courseId, name);
    }
}

// ELC class for testing
public class EducationInstituteSystem {
    public static void main(String[] args) {
        // Create courses
        Course[] courses = {
                new Course(101, "Java Programming", 25000.0),
                new Course(102, "Python Programming", 22000.0),
                new Course(103, "Web Development", 28000.0),
                new Course(104, "Data Science", 35000.0)
        };

        // Create offers
        Offer[] offers = {
                new Offer("Early Bird Discount: 10% off on all courses!"),
                new Offer("Refer a Friend: Get 15% cashback!"),
                new Offer("Weekend Special: Enroll in two courses, get 20% off on second course!")
        };

        // Create education institute
        EducationInstitute institute = new EducationInstitute(courses, offers);

        // Read student name
        String studentName = IO.readln();

        // Create student
        Student student = new Student(studentName, institute);

        // Student views courses and offers
        student.viewCoursesAndFees();
        System.out.println();
        student.viewOffers();
        System.out.println();

        // Read course ID for enrollment
        int courseId = Integer.parseInt(IO.readln());

        // Student enrolls in course
        student.enrollInCourse(courseId);
    }
}
