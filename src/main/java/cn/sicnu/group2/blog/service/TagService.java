package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.entity.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2019/12/19 21:24
 */
public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id,Tag tag);

    void deleteTag(Long id);

    Tag getTagByName(String name);


}
