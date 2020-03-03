package cn.fukuadiary.studentserver.service;

import cn.fukuadiary.studentserver.mapper.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CollegeService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/3
 * @Version 1.0
 **/
@Service
public class CollegeService {


    @Autowired
    private CollegeMapper collegeMapper;

    public List<String> allCollege(){
        List<String> collegeSelectAll = collegeMapper.selectAllCollege();
        System.out.println(collegeSelectAll);
        return collegeSelectAll;
    }
}
