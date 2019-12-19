package cn.sicnu.group2.blog.service;

import cn.sicnu.group2.blog.NotFindException;
import cn.sicnu.group2.blog.dao.TypeRepository;
import cn.sicnu.group2.blog.entity.Type;
import org.springframework.beans.BeanUtils;
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
        return typeRepository.save(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.findById( id ).get();
    }

    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t = typeRepository.findById( id ).get();
        if (t == null ){
           throw  new NotFindException("不存在你查询的数据类型");
        }
        else {
            BeanUtils.copyProperties( type,t );
            return typeRepository.save( t );
        }
    }

    @Transactional
    @Override
    public void deleteType(Long id) {
        typeRepository.deleteById( id );
    }

    @Override
    public Type getTypeByName(String name) {
        return typeRepository.findByName( name );
    }
}
