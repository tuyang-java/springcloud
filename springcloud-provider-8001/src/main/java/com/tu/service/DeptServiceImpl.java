package com.tu.service;

import com.tu.mapper.DeptMapper;
import com.tu.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ty
 * 2020/12/25
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept queryDept(Long deptno) {
        return deptMapper.queryDept(deptno);
    }

    public List<Dept> queryAllDept() {
        return deptMapper.queryAllDept();
    }
}
