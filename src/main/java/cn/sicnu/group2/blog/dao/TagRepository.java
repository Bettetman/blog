package cn.sicnu.group2.blog.dao;

import cn.sicnu.group2.blog.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/12/19 21:12
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
        Tag findByName(String tagname);
}
