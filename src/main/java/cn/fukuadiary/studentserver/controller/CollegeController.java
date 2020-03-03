package cn.fukuadiary.studentserver.controller;


import cn.fukuadiary.studentserver.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @ResponseBody
    @RequestMapping("/")
    public String index(Model model){
        List<String> allCollege = collegeService.allCollege();
        //
        model.addAttribute("allCollege",allCollege);
        return "success";
    }

}
