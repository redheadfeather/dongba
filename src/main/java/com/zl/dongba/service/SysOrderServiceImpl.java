package com.zl.dongba.service;

import com.zl.dongba.dao.SysOrdersDao;
import com.zl.dongba.entity.SysOrders;
import com.zl.dongba.vo.PageStat;
import com.zl.dongba.vo.PagedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhuLing
 * @date 2021/11/4 - 17:01
 */
@Service
public class SysOrderServiceImpl implements SysOrdersService{
    @Autowired
    private SysOrdersDao sysOrdersDao;
    @Override
    public SysOrders queryById(String id) {
        return sysOrdersDao.queryById(id);
    }

    @Override
    public PagedResult<SysOrders> queryAllByLimit(Integer pageCurrent, Integer pageSize) {
        Integer offset = (pageCurrent-1)*pageSize;
        Integer rowCount = sysOrdersDao.getRowCount();
        Integer pageCount = rowCount/pageSize+1;
        PageStat pageStat = new PageStat(pageCurrent,pageSize,rowCount,pageCount);
        List<SysOrders> orderList = sysOrdersDao.queryAllByLimit(offset,pageSize);
        if (orderList.size()!=0){
            return new PagedResult<SysOrders>(1,"ok",orderList,pageStat);
        }
        else{
            return new PagedResult<SysOrders>(2,"something wrong!",null,pageStat);
        }
    }

    @Override
    public int insert(SysOrders sysOrders) {
        return sysOrdersDao.insert(sysOrders);
    }

    @Override
    public int update(SysOrders sysOrders) {
        return sysOrdersDao.update(sysOrders);
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
