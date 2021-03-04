package com.tu.pojo;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * ty
 * 2020/12/25
 */
@Data
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String dSource;

    public Dept(String dname) {
        this.dname = dname;
    }
}
