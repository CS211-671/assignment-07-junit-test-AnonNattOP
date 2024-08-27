package ku.cs.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StudentListTest {

    @Test
    void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "John", 11);
        studentList.addNewStudent("2", "Jack", 12);
        studentList.addNewStudent("3", "Jane", 13);
        studentList.findStudentById("1").addScore(10);
        double expect = 21;
        double actual = studentList.findStudentById("1").getScore();
        assertEquals(expect, actual);
    }

    @Test
    void testViewGradeOfId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "John", 11);
        studentList.addNewStudent("2", "Jack", 12);
        studentList.addNewStudent("3", "Jane", 13);

        String expect = "F";
        String actual = studentList.viewGradeOfId("1");
        assertEquals(expect, actual);
    }

}