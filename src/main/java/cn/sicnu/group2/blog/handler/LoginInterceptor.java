package cn.sicnu.group2.blog.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cxf
 * @date 2019/12/18 10:19
 */
@Component
public class LoginInterceptor implements  HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("接收到请求");
        if (request.getSession().getAttribute("user") == null) {
            System.out.println("is null");
            response.sendRedirect("/admin");
            return false;
        } else {
            System.out.println("name:"+request.getSession().getAttribute("user"));
            return true;
        }
    }
}
