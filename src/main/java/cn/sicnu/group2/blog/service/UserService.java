package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.entity.User;

/**
 * Created by Administrator on 2019/12/11 23:18
 */
public interface UserService {

    User checkUser(String username,String password);
}
