package cn.fukuadiary.studentserver.model;

import lombok.Data;

/**
 * @ClassName TeacherRolePrivilege
 * @Description 教师角色权限关联表实体类
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/
@Data
public class TeacherRolePrivilege {
    private Long roleId;
    private Long privilegeId;
}
