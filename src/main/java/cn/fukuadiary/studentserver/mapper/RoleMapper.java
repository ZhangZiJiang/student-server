package cn.fukuadiary.studentserver.mapper;

import cn.fukuadiary.studentserver.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/5
 * @Version 1.0
 **/
@Mapper
public interface RoleMapper {

    @Select("select role_name from role")
    List<Role> selectRoleName();
}
