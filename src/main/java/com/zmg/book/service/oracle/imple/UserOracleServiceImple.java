package com.zmg.book.service.oracle.imple;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmg.book.entity.Student;
import com.zmg.book.entity.User;
import com.zmg.book.mapper.mysqlmapper.UserMysqlMapper;
import com.zmg.book.mapper.oraclemapper.UserOracleMapper;
import com.zmg.book.service.oracle.UserOracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Service("oracleUserService")
public class UserOracleServiceImple extends ServiceImpl<UserOracleMapper, Student> implements UserOracleService {
    @Autowired(required = false)
    private UserOracleMapper userOracleMapper;
    @Override
    public List<Student> getAll() {
        return userOracleMapper.getAll();
    }

    @Override
    public Student selectById(Long id) {
        return userOracleMapper.selectById(id);
    }

    @Override
    public boolean saveBatch(Collection<Student> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Student> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Student> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Student entity) {
        return false;
    }

    @Override
    public Student getOne(Wrapper<Student> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Optional<Student> getOneOpt(Wrapper<Student> queryWrapper, boolean throwEx) {
        return Optional.empty();
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Student> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Student> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }


    @Override
    public Class<Student> getEntityClass() {
        return null;
    }
}
