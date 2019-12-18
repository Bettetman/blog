package cn.sicnu.group2.blog.web;

import cn.sicnu.group2.blog.NotFindException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Administrator on 2019/12/10 22:01
 */
@Controller
public class IndexControllor {
    @GetMapping("/")
    public  String index(){
//        int  i = 9/0;
//        String blog = null;
//        if (blog==null){
//            throw  new NotFindException("page not find");
//        }
        System.out.println("-------------index------------------");
        return "index";
    }

}
