package com.weison.tliasweb.controller;

import com.weison.tliasweb.pojo.Dept;
import com.weison.tliasweb.pojo.Result;
import com.weison.tliasweb.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/dept")
public class DempController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/getDeptList")
    public Result getDeptList() {
        log.info("query deptList");
        List<Dept> deptList = deptService.getDeptList();
        return Result.success(deptList);
    }

    @PostMapping("/{id}")
    public Result deleteDept(@PathVariable Integer id) {
        log.info("delete dept by id:{}", id);
        deptService.delete(id);
        return  Result.success();
    }

    @PostMapping("/add")
    public Result addDept(@RequestBody Dept dept) {
        log.info("add dept:{}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @PostMapping("/update")
    public Result updateDept(@RequestBody Dept dept) {
        log.info("update");
        deptService.update(dept);
        return  Result.success();
    }
}
