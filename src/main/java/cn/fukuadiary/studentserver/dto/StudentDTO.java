package cn.fukuadiary.studentserver.dto;

import cn.fukuadiary.studentserver.model.Teacher;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName StudentDTO
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/4
 * @Version 1.0
 **/
@Data
public class StudentDTO {
    private Long id;
    private String studentName;
    private String sex;
    private Long studentId;
    private String cardId;
    private String collegeName;
    private String discipline;
    private String classes;
    private String assistantTeacherName;
    private Date printTime;
    private String teacherName;
    private String phone;
    private String assistantTeacherPhone;
}
