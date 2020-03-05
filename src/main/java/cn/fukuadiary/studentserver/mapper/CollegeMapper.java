package cn.fukuadiary.studentserver.mapper;

import cn.fukuadiary.studentserver.model.College;
import org.apache.ibatis.annotations.Mapper;
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

    @Select("select * from college")
    List<College> selectAllCollege();

    @Select("select id from college where college_name=#{collegeName}")
    Integer selectIdByCollegeName(String collegeName);

    @Select("select college_name from college where college_name=#{collegeName}")
    String selectNameByCollegeName(Long id);

}
