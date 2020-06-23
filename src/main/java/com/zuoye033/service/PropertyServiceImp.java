package com.zuoye033.service;

import com.zuoye033.entity.TabOwner;
import com.zuoye033.entity.TabRoom;
import com.zuoye033.mapper.TabOwnerMapper;
import com.zuoye033.mapper.TabRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImp implements PropertyService {

    @Autowired
    TabOwnerMapper tabOwnerMapper;
    @Autowired
    TabRoomMapper tabRoomMapper;
    /**
     * 用来查看所有的用户信息
     * @return
     */
    @Override
    public List<TabOwner> selectOwner() {
        return tabOwnerMapper.selectAllOwner();
    }

    /**
     * 用来查看所有的房产信息做下拉
     * @return
     */
    @Override
    public List<TabRoom> selectRoom() {
        return tabRoomMapper.selectAll();
    }

    /**
     * 用来新增用户信息
     * @param tabOwner
     * @return
     */
    @Override
    public int insertOwner(TabOwner tabOwner) {
        return tabOwnerMapper.insert(tabOwner);
    }
}
