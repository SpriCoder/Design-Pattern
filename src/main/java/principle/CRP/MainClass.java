package principle.CRP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class MainClass {
    public static void main(String[] args) {
        DBUtil dbUtil = new NewDBUtil();
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.setDbOperator(dbUtil);
        TeacherDAO teacherDAO = new TeacherDAO();
        teacherDAO.setDbOperator(dbUtil);

        StudentDTO studentDTO1 = new StudentDTO("1");
        StudentDTO studentDTO2 = new StudentDTO("2");

        TeacherDTO teacherDTO1 = new TeacherDTO("3");
        TeacherDTO teacherDTO2 = new TeacherDTO("4");

        studentDAO.save(studentDTO1);
        studentDAO.save(studentDTO2);
        System.out.println(studentDAO.findStudentById("1"));
        System.out.println(studentDAO.findStudentById("4"));
        System.out.println(studentDAO.findAllStudents());

        teacherDAO.save(teacherDTO1);
        teacherDAO.save(teacherDTO2);
        System.out.println(teacherDAO.findTeacherById("3"));
        System.out.println(teacherDAO.findTeacherById("2"));
        System.out.println(teacherDAO.findAllTeacher());
    }
}
