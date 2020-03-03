package cn.fukuadiary.studentserver.controller;

import cn.fukuadiary.studentserver.model.Student;
import cn.fukuadiary.studentserver.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/3
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("student/{collegeName}")
    public String studentLogin(){
        loginService.studentLoginService();
    }

}
