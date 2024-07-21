package com.weison.tliasweb.controller;

import com.weison.tliasweb.pojo.Dept;
import com.weison.tliasweb.pojo.Result;
import com.weison.tliasweb.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DempController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/getDeptList")
    public Result getDeptList() {
        log.info("quert deptList");
        List<Dept> deptList = deptService.getDeptList();
        return Result.success(deptList);
    }
}
