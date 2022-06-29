package com.wang.dao;

import com.wang.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门 dao
@Repository
public class DepartmentDao {

    //模拟数据库中的数据

    private static Map<Integer, Department> departments = null;
    static {
        //创建一个部门表
        departments =new HashMap<Integer,Department>();

        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(102,"市场部"));
        departments.put(103,new Department(103,"103部"));
        departments.put(104,new Department(104,"104部"));
        departments.put(105,new Department(105,"105部"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartements(){
        return departments.values();
    }
    //通过id获取部门
    public Department getDepartmentBYId(Integer id){
        return departments.get(id);
    }

}