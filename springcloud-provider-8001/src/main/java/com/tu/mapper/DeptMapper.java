package com.tu.mapper;

import com.tu.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ty
 * 2020/12/25
 */
@Mapper
@Repository
public interface DeptMapper {
    boolean addDept(Dept dept);

    Dept queryDept(Long deptno);

    List<Dept> queryAllDept();
}
