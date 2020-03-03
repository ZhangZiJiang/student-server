package cn.fukuadiary.studentserver.model;

import lombok.Data;

/**
 * @ClassName StudentRole
 * @Description 学生用户名密码表实体类
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/
@Data
public class StudentRole {
    private String studentId;
    private String userName;
    private String password;
}
