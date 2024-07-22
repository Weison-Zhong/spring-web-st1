package com.weison.tliasweb.service;

import com.weison.tliasweb.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    List<Dept> getDeptList();

    void delete(Integer id);

    void add(Dept dept);

    void update(Dept dept);
}
