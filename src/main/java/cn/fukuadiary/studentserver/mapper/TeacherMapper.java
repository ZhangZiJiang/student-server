package cn.fukuadiary.studentserver.mapper;

import cn.fukuadiary.studentserver.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/4
 * @Version 1.0
 **/
@Mapper
public interface TeacherMapper {

    @Select("select * from teacher where id=#{id}")
    Teacher selectAllByTeacherId(Long id);

    @Select("select teacher_name from teacher where id=#{id}")
    String selectNameByTeacherId(Long id);
}
