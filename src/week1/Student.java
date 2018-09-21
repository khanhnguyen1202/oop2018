package week1;

public class Student {
    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public String getGroup() {
        return this.group;
    }
    public String getEmail() {
        return this.email;
    }
    public void setName(String _name) {
        this.name = _name;
    }
    public void setId(String _id) {
        this.id = _id;
    }
    public void  setGroup(String _group){
        this.group = _group;
    }
    public void setEmail(String _email){
        this.email = _email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";


    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "INT22041";
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getInfo() {
        // TODO:
        return name + " " + id + " " + group + " " + email; // xóa dòng này sau khi cài đặt
    }
}
