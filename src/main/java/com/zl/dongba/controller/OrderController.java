package com.zl.dongba.controller;

import com.zl.dongba.entity.SysOrders;
import com.zl.dongba.service.SysOrdersService;
import com.zl.dongba.vo.PagedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZhuLing
 * @date 2021/11/4 - 16:13
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private SysOrdersService sysOrdersService;
    @RequestMapping("/doFindByPage")
    public PagedResult<SysOrders> doFindByPage(@RequestParam Integer page_current,
                                               @RequestParam Integer page_size,
                                               @RequestParam String order_name){

        return sysOrdersService.queryAllByLimit(page_current,page_size);
    }
}
