package cn.fukuadiary.studentserver.model;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @ClassName Role
 * @Description 老师角色表实体类
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/
@Data
public class Role {
    private Long id;
    private String roleName;
    private Integer enabled;
    private Long createBy;
    private Date createTime;
}
