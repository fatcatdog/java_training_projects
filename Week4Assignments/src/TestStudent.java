public class TestStudent {
    public static void main(String[] args) {
        // Test constructor and toString()
        Student ahTeck = new Student("Tan Ah Teck", "1 Happy Ave");
//        System.out.println(ahTeck);  // toString()

        // Test Setters and Getters
        ahTeck.setAddress("8 Kg Java");
//        System.out.println(ahTeck);  // run toString() to inspect the modified instance
//        System.out.println(ahTeck.getName());
//        System.out.println(ahTeck.getAddress());

        // Test addCourseGrade(), printGrades() and getAverageGrade()
        ahTeck.addCourseGrade("IM101", 89);
        ahTeck.addCourseGrade("IM102", 57);
        ahTeck.addCourseGrade("IM103", 96);

        ahTeck.printGrades();
        //        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());


    }
}