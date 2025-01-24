package com.zmg.book.service.sybase.imple;


import com.zmg.book.entity.Departments;
import com.zmg.book.mapper.sybasemapper.DepSybaseMapper;
import com.zmg.book.service.sybase.DepSybaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sybaseDepService")
public class DepSybaseServiceImple implements DepSybaseService {
    @Autowired(required = false)
    private DepSybaseMapper depSybaseMapper;
    @Override
    public List<Departments> getAll() {
        return depSybaseMapper.getAll();
    }

    @Override
    public Departments selectById(Long id) {
        return depSybaseMapper.selectById(id);
    }
}
