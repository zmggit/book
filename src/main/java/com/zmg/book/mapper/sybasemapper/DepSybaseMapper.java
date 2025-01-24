package com.zmg.book.mapper.sybasemapper;


import com.zmg.book.entity.Departments;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepSybaseMapper {
    List<Departments> getAll();
    Departments selectById(Long id);
}
