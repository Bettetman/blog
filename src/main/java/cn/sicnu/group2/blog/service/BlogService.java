package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by LZY on 2020/1/1 23:19
 */
public interface BlogService {
    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable,Blog blog);

    Blog saveBlog (Blog blog);

    Blog updateBlog(Long id,Blog blog);

    void deleteBlog(Long id);
}
