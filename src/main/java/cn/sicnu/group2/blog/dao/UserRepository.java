package cn.sicnu.group2.blog.dao;

import cn.sicnu.group2.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/12/11 23:20
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username,String password);

}
