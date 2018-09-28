package week2.task3;
import java.util.*;

public class Task3 {
}

class Plant {
    private String name;
    private String environment;
    private Double heightAverage;

    //constructor
    public Plant(String name, String environment, Double heightAverage) {
        this.name = name;
        this.environment = environment;
        this.heightAverage = heightAverage;
    }
    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setHeightAverage(Double heightAverage) {
        this.heightAverage = heightAverage;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getEnvironment() {
        return environment;
    }

    public Double getHeightAverage() {
        return heightAverage;
    }
    //toString

    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", environment='" + environment + '\'' +
                ", heightAverage=" + heightAverage +
                '}';
    }
    // HÀm kiểm tra có cùng môi trường không
    public static Boolean SameEnvionment(String a, String b){
        return a.equals(b);
    }

    // Hàm so sánh chiều cao 2 loài
    public static void Compare(Plant a, Plant b){
        if (a.heightAverage > b.heightAverage) System.out.println( a.name + " cao hơn " + b.name);
        else if (a.heightAverage < b.heightAverage) System.out.println(a.name + " thấp hơn " + b.name);
        else System.out.println("Loài" + a.name + "cao bằng loài" + b.name);

    }

    public static void main(String[] args){
        Plant a = new Plant("cỏ","Đồng bằng",15.0);
        Plant b = new Plant("cây sấu","Đồng bằng",300.0);
        if (SameEnvionment(a.environment,b.environment)) System.out.println("2 Loài cùng môi trường");
        else System.out.println("2 loài không cùng môi trường");
        Compare(a,b);

    }

}

//animal
class Animal{
    public static int limit = 6;//gioi han 5 con vat
    private String Name;//ten
    private int Age;// tuoi
    private int High;//do cao

    //getter
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getHigh() {
        return High;
    }

    //setter
    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setHigh(int high) {
        High = high;
    }
    public static Animal animal[] = new Animal[100];
    //contructor
    public Animal (String Name, int Age, int High){
        this.Name = Name;
        this.Age = Age;
        this.High = High;
    }
    //xem ten co trung nhau khong
    public boolean sameName(Animal s2){
        if (this.getName() == null || s2.getName() == null)
            return false;
        else return (this.getName().equals(s2.getName()));
    }
    //Sap xep theo tuoi tang dan
    public static void arrayAge(){
        // ham sap xep
        for (int i = 0; i < limit - 1; i++)
        {
            for (int j = 0; j < limit - i - 1; j++)
            {
                if (animal[j].getAge() > animal[j+1].getAge())
                {
                    int temp = animal[j].getAge();
                    animal[j].setAge(animal[j+1].getAge());
                    animal[j+1].setAge(temp);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep la");
        for (int i = 0; i < limit; i++)
            System.out.println(animal[i].getName() + "/" + animal[i].getAge() + "/" + animal[i].getHigh());
    }
    //So sanh chieu cao
    public void Highvs(Animal s1){
        if (this.getHigh() < 0 || s1.getHigh() < 0)
            System.out.println("Chieu cao khong hop le");
        else {
            if (this.getHigh() == s1.getHigh())
                System.out.println(this.getName() + " and " + s1.getName() + " co chieu cao bang nhau");
            else if (this.getHigh() > s1.getHigh())
                System.out.println(this.getName() + " co chieu cao lon hon chieu cao cua " + s1.getName());
            else
                System.out.println(this.getName() + " co chieu cao nho hon chieu cao cua " + s1.getName());
        }
    }
    public static void main(String[] args) {
        animal[0] = new Animal("Dog", 15, 20);
        animal[1] = new Animal("Cat", 16, 34);
        animal[2] = new Animal("Dolphin", 10, 28);
        animal[3] = new Animal("Shark", 18, 34);
        animal[4] = new Animal("Lion", 14, 30);
        animal[5] = new Animal("Tiger", 14, 34);
        //in ra so sanh cung ten
        System.out.println(animal[0].sameName(animal[1]));
        //in ra danh sach sap xep theo tuoi
        arrayAge();
        //So sanh chieu cao
        animal[2].Highvs(animal[4]);
    }
}

//Student
class Student {
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
    // Constructor 1

    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";


    }

    // Constructor 2

    Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "INT22041";
        // TODO:
    }


    //Constructor 3
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

    public static ArrayList<Student> students = new ArrayList<Student>();
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1==null || s2==null) return false;
        return s1.equals(s2);
    }

    public static void studentsByGroup() {
        // TODO:
        ArrayList<String> groupList = new ArrayList<String>();
        for (int i = 0; i < students.size(); i++) {
            if (!groupList.contains(students.get(i).getGroup())) {
                groupList.add(students.get(i).getGroup());
            }
        }
        for (int i = 0; i < groupList.size(); i++) {
            System.out.println(groupList.get(i));
            for (int j = 0; j < students.size(); j++) {
                if (students.get(j).getGroup().equals(groupList.get(i))) {
                    System.out.println(students.get(j).getInfo());
                }
            }
        }
    }

    public static void removeStudent(String id) {
        // Hàm xoá học sinh
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                students.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Student s1 = new Student();
        s1.setName("Khanh");
        s1.setEmail("khanh@gmai.com");
        s1.setGroup("INT22043");
        s1.setId("002");
        Student s2 = new Student("Minh", "001", "good@gmail.com");
        s2.setGroup("INT22042");
        Student s3 = new Student();
        Student s4 = new Student(s2);


        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        studentsByGroup();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getInfo());
        }
        System.out.println(sameGroup(students.get(1),students.get(2)));
        removeStudent("001");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getInfo());
        }

    }
}