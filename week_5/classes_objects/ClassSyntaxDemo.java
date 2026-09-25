package week_5.classes_objects;

class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    Course(
        String code,
        String title,
        int credits,
        int labCredits
    ) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    void printCourse() {

        System.out.println(
            code + " | " +
            title + " | Credits: " +
            credits + " | Lab Credits: " +
            labCredits
        );
    }
}

public class ClassSyntaxDemo {

    public static void main(String[] args) {

        Course dsa =
            new Course(
                "21CSC201J",
                "Data Structures",
                4,
                9
            );

        dsa.printCourse();
    }
}