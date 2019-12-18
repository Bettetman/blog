package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.dao.TypeRepository;
import cn.sicnu.group2.blog.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author cxf
 * @date 2019/12/18 11:26
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private  TypeRepository typeRepository;

    @Transactional
    @Override
    public Type saveType(Type type) {
        return null;
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.getOne(id);
    }

    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t = typeRepository.getOne(id);
        if (t == null ){
            typeRepository.saveAndFlush(type);
        }
        else {
           typeRepository.saveAndFlush(type);
        }
        return t;
    }

    @Transactional
    @Override
    public boolean deleteType(Long id) {
        return false;
    }
}
