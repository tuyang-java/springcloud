package com.tu.controller;

import com.tu.pojo.Dept;
import com.tu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ty
 * 2020/12/25
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/insert")
    public boolean insert(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{deptno}")
    public Dept get(@PathVariable("deptno")Long deptno){
        return deptService.queryDept(deptno);
    }

    @GetMapping("/dept/getAll")
    public List<Dept> getAll(){
        return deptService.queryAllDept();
    }


    @GetMapping("/dept/getDiscovery")
    public Object getClient(){
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER");
        for (ServiceInstance instance : instances) {
            System.out.println(instance+""+instance.getPort()+"/t"+
                    instance.getHost()+"/t"+
                    instance.getUri());

        }
        System.out.println("测试git1");
        return this.client;
    }
}
