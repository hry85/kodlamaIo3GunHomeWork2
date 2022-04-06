public class Student extends User {
    private String chosenCourse;
    private String completionRate;

    public Student(){

    }

    public Student(int id, String firstName, String lastName, String email, String password, String chosenCourse, String completionRate) {
        super(id, firstName, lastName, email, password);
        this.chosenCourse = chosenCourse;
        this.completionRate = completionRate;
    }

    public String getChosenCourse() {
        return chosenCourse;
    }

    public void setChosenCourse(String chosenCourse) {

        this.chosenCourse = chosenCourse;
    }

    public String getCompletionRate() {

        return completionRate;
    }

    public void setCompletionRate(String completionRate) {

        this.completionRate = completionRate;
    }
}
