package com.weison.tliasweb.controller;

import com.weison.tliasweb.pojo.PageBean;
import com.weison.tliasweb.pojo.Result;
import com.weison.tliasweb.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("getEmpList")
    public Result page(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("query emp list,{},{}",pageNum,pageSize);
        PageBean pageBean = empService.page(pageNum, pageSize);
        return Result.success(pageBean);


    }
}
