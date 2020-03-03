package cn.fukuadiary.studentserver.model;

import lombok.Data;

/**
 * @ClassName Teacher
 * @Description 教师表的实体类 POJO
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/

@Data
public class Teacher {
    private Long Id;
    private String teacherName;
    private String cardId;
    private String role;
    private String description;
}
