package cn.fukuadiary.studentserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName CollegeMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/3
 * @Version 1.0
 **/
@Mapper
public interface CollegeMapper {

    @Select("select college_name from college")
    List<String> selectAllCollege();

    @Select("select id from college where college_name={collegeName}")
    Integer selectIdByCollegeName(String collegeName);

}
