package week1;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
public class StudentManagement {
    public static ArrayList<Student> students = new ArrayList<Student>();
    public boolean sameGroup(Student s1, Student s2) {
        if (s1==null || s2==null) return false;
        return s1.equals(s2);
    }

    void studentsByGroup() {
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

    void removeStudent(String id) {
        // TODO:
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

        StudentManagement test = new StudentManagement();
        test.students.add(s1);
        test.students.add(s2);
        test.students.add(s3);
        test.students.add(s4);
        test.studentsByGroup();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getInfo());
        }
        System.out.println(test.sameGroup(students.get(1),students.get(2)));
        test.removeStudent("001");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getInfo());
        }

    }
}
