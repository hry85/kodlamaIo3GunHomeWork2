public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();



        Student student = new Student();
        student.setFirstName("Huray");
        student.setLastName("Erdi");
        student.setEmail("huray@gmail.com");
        student.setPassword("1234");
        student.setChosenCourse("Java");
        student.setCompletionRate("39");

        userManager.logIn(student);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.update(student);

        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setCource("Java");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);


        userManager.logOut(student);

    }
}
