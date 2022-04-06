public class Instructor extends User {

    private String cource;

    public Instructor(){

    }

    public Instructor(int id, String firstName, String lastName,String cource) {
        super();
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.cource = cource;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }
}
