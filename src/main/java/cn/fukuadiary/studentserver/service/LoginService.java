package cn.fukuadiary.studentserver.service;

import cn.fukuadiary.studentserver.dto.StudentDTO;
import cn.fukuadiary.studentserver.mapper.CollegeMapper;
import cn.fukuadiary.studentserver.mapper.RoleMapper;
import cn.fukuadiary.studentserver.mapper.StudentMapper;
import cn.fukuadiary.studentserver.mapper.TeacherMapper;
import cn.fukuadiary.studentserver.model.College;
import cn.fukuadiary.studentserver.model.Role;
import cn.fukuadiary.studentserver.model.Student;
import cn.fukuadiary.studentserver.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/3
 * @Version 1.0
 **/
@Service
public class LoginService {


    @Autowired
    private CollegeMapper collegeMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private RoleMapper roleMapper;


    public List<College> allCollege() {
        List<College> collegeSelectAll = collegeMapper.selectAllCollege();
        return collegeSelectAll;
    }


    public StudentDTO studentLoginService(String collegeName, Long studentId, String password) {
        //打印单上的学生信息
        Student student = studentMapper.selectInfoByStudentRole(studentId, password);
        Teacher teacher = teacherMapper.selectAllByTeacherId(student.getTeacherId());
        Teacher assistantTeacher = teacherMapper.selectAllByTeacherId(student.getAssistantTeacherId());

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setAssistantTeacherName(assistantTeacher.getTeacherName());
        studentDTO.setCardId(student.getCardId());
        studentDTO.setClasses(student.getClasses());
        studentDTO.setCollegeName(collegeName);
        studentDTO.setDiscipline(student.getDiscipline());
        studentDTO.setStudentId(student.getStudentId());
        studentDTO.setTeacherName(teacher.getTeacherName());
        studentDTO.setStudentName(student.getStudentName());
        studentDTO.setPrintTime(student.getPrintTime());
        studentDTO.setSex(student.getSex());
        studentDTO.setPhone(teacher.getPhone());
        studentDTO.setAssistantTeacherPhone(assistantTeacher.getPhone());

        return studentDTO;
    }

    public void teacherLoginService(String cardId) {

        studentMapper.selectRoleByTeacherCardId(cardId);
        List<Student> studentList = studentMapper.selectInfoByTeacherCardId(cardId);

    }

    public List<Role> allRole() {
        List<Role> allRoleName = roleMapper.selectRoleName();
        return allRoleName;
    }
}
