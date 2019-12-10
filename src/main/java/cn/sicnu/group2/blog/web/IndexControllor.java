package cn.sicnu.group2.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2019/12/10 22:01
 */
@Controller
public class IndexControllor {
    @GetMapping("/")
    public  String index(){
//        int  i = 9/0;
        return "index";
    }

}
