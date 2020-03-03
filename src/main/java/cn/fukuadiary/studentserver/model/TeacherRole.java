package cn.fukuadiary.studentserver.model;

import lombok.Data;

/**
 * @ClassName TeacherRole
 * @Description 教师用户角色关联表实体类
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/
@Data
public class TeacherRole {
    private String teacherId;
    private String roleId;
}
