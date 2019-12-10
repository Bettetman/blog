package cn.sicnu.group2.blog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Administrator on 2019/12/10 23:40
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFindException extends RuntimeException{
    public NotFindException() {
    }

    public NotFindException(String message) {
        super( message );
    }

    public NotFindException(String message, Throwable cause) {
        super( message, cause );
    }
}
