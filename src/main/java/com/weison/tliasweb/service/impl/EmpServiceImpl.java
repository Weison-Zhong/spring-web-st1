package com.weison.tliasweb.service.impl;

import com.weison.tliasweb.mapper.EmpMapper;
import com.weison.tliasweb.pojo.Emp;
import com.weison.tliasweb.pojo.PageBean;
import com.weison.tliasweb.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer pageNum, Integer pageSize) {
        Long count = empMapper.count();
        Integer start = (pageNum - 1) * pageSize;
        log.info("start,{},pageSIze,{}",start,pageSize);
        List<Emp> empList = empMapper.page(start, pageSize);
        PageBean pageBean = new PageBean(count, empList);
        return pageBean;
    }
}
