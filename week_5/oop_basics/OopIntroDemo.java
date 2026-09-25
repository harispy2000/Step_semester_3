package week_5.oop_basics;

class SrmStudent {

    String name;
    String regNo;
    int attendance;

    void checkExamEligibility() {

        if (attendance >= 75) {
            System.out.println(
                name + " (" + regNo + ") - " +
                attendance + "% - Hall ticket released"
            );
        } else {
            System.out.println(
                name + " (" + regNo + ") - " +
                attendance + "% - Detained, meet your class advisor"
            );
        }
    }
}

public class OopIntroDemo {

    public static void main(String[] args) {

        SrmStudent ravi = new SrmStudent();

        ravi.name = "Ravi";
        ravi.regNo = "RA2311003010123";
        ravi.attendance = 82;

        SrmStudent anitha = new SrmStudent();

        anitha.name = "Anitha";
        anitha.regNo = "RA2311003010124";
        anitha.attendance = 68;

        ravi.checkExamEligibility();
        anitha.checkExamEligibility();
    }
}