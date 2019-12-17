package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.dao.UserRepository;
import cn.sicnu.group2.blog.entity.User;
import cn.sicnu.group2.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/12/11 23:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword( username, MD5Utils.code(password) );
        return user;
    }
}
