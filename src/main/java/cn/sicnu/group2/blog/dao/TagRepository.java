package cn.sicnu.group2.blog.dao;

import cn.sicnu.group2.blog.entity.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2019/12/19 21:12
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
        Tag findByName(String tagname);


        @Query("select t from Tag t")
        List<Tag> findTop(Pageable pageable);
}
