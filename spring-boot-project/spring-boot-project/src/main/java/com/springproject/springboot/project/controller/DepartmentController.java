package com.springproject.springboot.project.controller;

import com.springproject.springboot.project.Error.DepartmentNotFoundException;
import com.springproject.springboot.project.entity.Department;
import com.springproject.springboot.project.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService DEPARTMENT_SERVICE;
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class );
    @PostMapping("/departments")
    public Department saveDepartment(@Valid  @RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController");
    return DEPARTMENT_SERVICE.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return DEPARTMENT_SERVICE.fetchDepartmentList();
    }
    @GetMapping("/departments/{Id}")
    public Department fetchDepartmentById(@PathVariable("Id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Inside fetchDepartmentById of DepartmentController");
        return DEPARTMENT_SERVICE.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/departments/{Id}")
    public String deleteDepartmentById(@PathVariable("Id") Long departmentId){
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");
        DEPARTMENT_SERVICE.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";


    }
    @PutMapping("/departments/{Id}")
    public Department updateDepartment(@PathVariable("Id") Long departmentId,
                                       @RequestBody Department department){
        LOGGER.info("Inside updateDepartment of DepartmentController");
        return DEPARTMENT_SERVICE.updateDepartment(departmentId, department);

    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        LOGGER.info("Inside fetchDepartmentByName of DepartmentController");
    return DEPARTMENT_SERVICE.fetchDepartmentByName(departmentName);

    }
}
