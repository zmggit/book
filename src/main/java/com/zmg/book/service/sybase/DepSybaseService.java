package com.zmg.book.service.sybase;

import com.zmg.book.entity.Departments;

import java.util.List;


public interface DepSybaseService {
    public List<Departments> getAll();
    public Departments selectById(Long id);
}


