package cn.sicnu.group2.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cxf
 * @date 2019/12/18 10:13
 */
@Controller
@RequestMapping("/admin")
public class BlogController{

    @GetMapping("/blogs")
    public String blog(){
        return "admin/blogs";
    }

}
