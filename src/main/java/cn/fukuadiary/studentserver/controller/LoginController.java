package cn.fukuadiary.studentserver.controller;

import cn.fukuadiary.studentserver.dto.StudentDTO;
import cn.fukuadiary.studentserver.exception.MyException;
import cn.fukuadiary.studentserver.model.College;
import cn.fukuadiary.studentserver.model.Role;
import cn.fukuadiary.studentserver.model.Student;
import cn.fukuadiary.studentserver.service.LoginService;
import cn.fukuadiary.studentserver.tool.BeingTool;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/3
 * @Version 1.0
 **/
@Slf4j
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @ResponseBody
    @GetMapping("/student")
    public List<College> index(Model model) {
        List<College> allCollege = loginService.allCollege();
//        model.addAttribute("allCollege", allCollege);
        return allCollege;
    }


    @ResponseBody
    @PostMapping("/student/{collegeName}")
    public StudentDTO studentLogin(@PathVariable(name = "collegeName", value = "collegeName") String collegeName,
                                   @RequestParam(name = "studentId") Long studentId,
                                   @RequestParam(name = "password") String password) {

        if (BeingTool.isZeroToInteger(studentId.intValue())) {
            log.error("not null");
        }
        if (BeingTool.isEmptyToString(collegeName, password)) {
            log.error("not null");
        }
        StudentDTO studentDTO = loginService.studentLoginService(collegeName, studentId, password);
        if (studentDTO == null) {
            log.error("no this student");
        }
        return studentDTO;
    }



    @ResponseBody
    @GetMapping("/student")
    public List<Role> indexTeacher() {
        List<Role> allRole = loginService.allRole();
//        model.addAttribute("allCollege", allCollege);
        return allRole;
    }

    @PostMapping("/teacher/{cardId}")
    public String postTeacherLogin(@PathVariable(name = "cardId", value = "cardId") String cardId,
                                   @RequestParam(name = "roleName") String roleName) {
        loginService.teacherLoginService(cardId);
        return null;
    }
}
