package com.weison.tliasweb.service.impl;

import com.weison.tliasweb.mapper.DeptMapper;
import com.weison.tliasweb.pojo.Dept;
import com.weison.tliasweb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getDeptList() {
        return deptMapper.getDeptList();
    }
}
