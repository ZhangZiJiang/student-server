package cn.fukuadiary.studentserver.model;

import lombok.Data;

/**
 * @ClassName Privilege
 * @Description 权限表实体类
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/

@Data
public class Privilege {
    private String id;
    private String privilegeName;
    private String privilegeUrl;
}
