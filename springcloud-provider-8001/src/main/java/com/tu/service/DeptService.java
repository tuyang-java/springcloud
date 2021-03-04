package com.tu.service;

import com.tu.pojo.Dept;

import java.util.List;

/**
 * ty
 * 2020/12/25
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryDept(Long deptno);

    public List<Dept> queryAllDept();
}
