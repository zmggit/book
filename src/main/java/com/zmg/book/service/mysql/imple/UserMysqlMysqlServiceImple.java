package com.zmg.book.service.mysql.imple;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmg.book.entity.User;
import com.zmg.book.mapper.mysqlmapper.UserMysqlMapper;
import com.zmg.book.service.mysql.UserMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

//避免名称冲突
@Service("mysqlUserService")
public class UserMysqlMysqlServiceImple extends ServiceImpl<UserMysqlMapper, User> implements UserMysqlService {
    @Autowired(required = false)

    private UserMysqlMapper userMysqlMapper;
    @Override
    public List<User> getAll() {
        return userMysqlMapper.getAll();
    }

    @Override
    public User selectById(Long id) {
        return userMysqlMapper.selectById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userMysqlMapper.selectList(null);
    }

    @Override
    public boolean saveBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return false;
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Optional<User> getOneOpt(Wrapper<User> queryWrapper, boolean throwEx) {
        return Optional.empty();
    }

    @Override
    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }


    @Override
    public Class<User> getEntityClass() {
        return null;
    }
}
