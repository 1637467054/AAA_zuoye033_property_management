package com.zuoye033.mapper;

import com.zuoye033.common.CommonMapper;
import com.zuoye033.entity.TabRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TabRoomMapper extends CommonMapper<TabRoom> {
}