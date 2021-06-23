package com.springproject.springboot.project.service;

import com.springproject.springboot.project.Error.DepartmentNotFoundException;
import com.springproject.springboot.project.entity.Department;


import java.util.List;


public interface  DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;
    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
