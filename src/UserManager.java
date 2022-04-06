public class UserManager {
    public void logIn(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanicisi giris yapti.");

    }
    public void logOut(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanicisi cikis yapti.");
    }
    public void add(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getCource() + " kursu egitimi veriyor .");
    }
}
