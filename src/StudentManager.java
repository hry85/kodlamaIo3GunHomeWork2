public class StudentManager extends UserManager {

    public void add(Student student){
        System.out.println(student.getFirstName() + " " + student.getChosenCourse()  + " katildi.");
    }
    public void update(Student student){
        System.out.println(" % " + student.getCompletionRate() + " tamamladi.");
    }
}
