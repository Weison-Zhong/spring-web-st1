package com.weison.tliasweb.service;

import com.weison.tliasweb.pojo.PageBean;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    PageBean page(Integer pageNum, Integer pageSize);
}
