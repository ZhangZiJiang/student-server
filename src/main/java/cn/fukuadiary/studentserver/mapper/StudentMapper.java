package cn.fukuadiary.studentserver.mapper;

import cn.fukuadiary.studentserver.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/3
 * @Version 1.0
 **/
@Mapper
public interface StudentMapper {

    @Select("select * from student s WHERE s.student_id like (SELECT student_id from student_role WHERE student_id=#{studentId} and user_password=#{userPassword})")
    Student selectInfoByStudentRole(Long studentId, String userPassword);

    @Select("select * from student s WHERE s.teacher_id like (SELECT teacher from student_role WHERE card_id=#{cardId})")
    List<Student> selectInfoByTeacherCardId(String cardId);

    String selectRoleByTeacherCardId(String cardId);
}
