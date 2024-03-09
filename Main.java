import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        UserView<Student> view = new StudentView();
        view.sendOnConsole(service.getSortedStudentGroupByFIO());  
        

        Teacher teacher1 = new Teacher("aaa", "bbb", "bbb", "1");
        Teacher teacher2 = new Teacher("vvv", "ggg", "rrr", "2");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        TeacherService tService = new TeacherService(teacherList);
        TeacherView tView = new TeacherView();
        tView.sendOnConsole(tService.getSortedTeacherByFIO());
        
        
        
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroup()) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroupByFIO()) {
        //     System.out.println(student);
        // }
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(Student student : studentGroup){
//            System.out.println(student);
    }
}