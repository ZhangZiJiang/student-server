package cn.fukuadiary.studentserver.model;

import lombok.Data;

import java.util.Date;

/**
 * 学生表的实体类
 */
@Data
public class Student {
    private Long id;
    private String studentName;
    private String sex;
    private Date dateBirth;
    private Long studentId;
    private String cardId;
    private Long collegeId;
    private String discipline;
    private String classes;
    private Long teacherId;
    private Long assistantTeacherId;
    private Integer count;
    private Date printTime;
    private String address;
}
