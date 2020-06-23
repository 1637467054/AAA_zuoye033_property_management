package com.zuoye033.service;

import com.zuoye033.entity.TabOwner;
import com.zuoye033.entity.TabRoom;

import java.util.List;

public interface PropertyService {
    /**
     * 用来查看所有的用户信息
     * @return
     */
    List<TabOwner> selectOwner();

    /**
     * 用来查看所有的房产信息做下拉
     * @return
     */
    List<TabRoom> selectRoom();

    /**
     * 用来新增用户信息
     * @param tabOwner
     * @return
     */
    int insertOwner(TabOwner tabOwner);
}
