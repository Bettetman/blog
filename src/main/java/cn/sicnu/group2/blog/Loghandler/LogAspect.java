package cn.sicnu.group2.blog.Loghandler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by Administrator on 2019/12/11 0:08
 */
@Aspect
@Component
public class LogAspect {
    private  final Logger logger = LoggerFactory.getLogger( this.getClass() );
    @Pointcut("execution(* cn.sicnu.group2.blog.web.*.*(..))")
    public void  log(){

    }

    @Before( "log()" )
    public  void  doBefore(JoinPoint joinPoint){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String requestURI = request.getRequestURI();
        String remoteAddr = request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        RequestLog requestLog = new RequestLog( requestURI, remoteAddr, classMethod, args );

        logger.info( "request----:{}",requestLog );
    }
    @After( "log()" )
    public  void  doAfter(){
        logger.info( "--------after------" );
    }
    @AfterReturning(returning = "j",pointcut = "log()")
    public void doAfterReturn(Object j){
        logger.info( "result: {}" +j);
    }

    private  class  RequestLog{
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;

        public RequestLog(String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "RequestLog{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString( args ) +
                    '}';
        }
    }
}
