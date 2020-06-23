package com.zuoye033.mapper;

import com.zuoye033.common.CommonMapper;
import com.zuoye033.entity.TabOwner;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TabOwnerMapper extends CommonMapper<TabOwner> {
    List<TabOwner> selectAllOwner();
}