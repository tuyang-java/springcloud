package com.tu.controller;

import com.tu.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ty
 * 2020/12/25
 */
@RestController
public class DeptController {


    @Autowired
    RestTemplate restTemplate;

    private  String URL_PREX="http://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(URL_PREX+"/dept/insert",dept,boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{deptno}")
    public Dept get(@PathVariable("deptno")Long deptno){
        return restTemplate.getForObject(URL_PREX+"/dept/get/"+deptno,Dept.class);
    }

    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(URL_PREX+"/dept/getAll",List.class);
    }
}
