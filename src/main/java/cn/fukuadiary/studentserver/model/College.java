package cn.fukuadiary.studentserver.model;

import lombok.Data;

/**
 * @ClassName College
 * @Description 学院表实体类
 * @Author Administrator
 * @Date 2020/2/15
 * @Version 1.0
 **/
@Data
public class College {
    private Long id;
    private String collegeName;
    private Integer collegeCount;
    private Integer studentArrived;
}
