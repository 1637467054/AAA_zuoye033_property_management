package com.zuoye033.entity;

import javax.persistence.*;

@Table(name = "`tab_room`")
public class TabRoom {
    @Override
    public String toString() {
        return "TabRoom{" +
                "roomid=" + roomid +
                ", roomname='" + roomname + '\'' +
                '}';
    }

    /**
     * 房产id
     */
    @Id
    @Column(name = "`roomId`")
    private Integer roomid;

    /**
     * 房产名称
     */
    @Column(name = "`Roomname`")
    private String roomname;

    /**
     * 获取房产id
     *
     * @return roomId - 房产id
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * 设置房产id
     *
     * @param roomid 房产id
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * 获取房产名称
     *
     * @return Roomname - 房产名称
     */
    public String getRoomname() {
        return roomname;
    }

    /**
     * 设置房产名称
     *
     * @param roomname 房产名称
     */
    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }
}