package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.NotFindException;
import cn.sicnu.group2.blog.dao.TagRepository;
import cn.sicnu.group2.blog.entity.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019/12/19 21:33
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return tagRepository.save( tag );
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepository.findById( id ).get();
    }

    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll( pageable );
    }

    @Transactional
    @Override
    public Tag updateTag(Long id, Tag tag) {
        Tag tag1 = tagRepository.findById( id ).get();
        if (tag1 == null) {
            throw new NotFindException( "没有发现该标签" );
        }
        BeanUtils.copyProperties(tag,tag1);
        return tagRepository.save(tag1);
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById( id );
    }

    @Transactional
    @Override
    public Tag getTagByName(String name) {

        return tagRepository.findByName( name );
    }
}
