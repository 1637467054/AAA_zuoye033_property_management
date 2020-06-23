package com.zuoye033.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tab_owner`")
public class TabOwner {
    @Override
    public String toString() {
        return "TabOwner{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", ownerName='" + ownerName + '\'' +
                ", ownerPhone='" + ownerPhone + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", ownereMail='" + ownereMail + '\'' +
                ", ownerCar='" + ownerCar + '\'' +
                ", ownerTime=" + ownerTime +
                ", roomname='" + roomname + '\'' +
                '}';
    }

    /**
     * 业主id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 房产信息id
     */
    @Column(name = "`Room_id`")
    private Integer roomId;

    /**
     * 业主名称
     */
    @Column(name = "`Owner_name`")
    private String ownerName;

    /**
     * 业主电话
     */
    @Column(name = "`Owner_phone`")
    private String ownerPhone;

    /**
     * 业主身份证
     */
    @Column(name = "`Owner_id`")
    private String ownerId;

    /**
     * 业主邮箱
     */
    @Column(name = "`Ownere_mail`")
    private String ownereMail;

    /**
     * 车位
     */
    @Column(name = "`Owner_car`")
    private String ownerCar;

    /**
     * 入住时间
     */
    @Column(name = "`Owner_time`")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ownerTime;

    /**
     *房产名称
     */
    @Transient
    private String roomname;

    /**
     * 获取业主id
     *
     * @return id - 业主id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置业主id
     *
     * @param id 业主id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取房产信息id
     *
     * @return Room_id - 房产信息id
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置房产信息id
     *
     * @param roomId 房产信息id
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取业主名称
     *
     * @return Owner_name - 业主名称
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * 设置业主名称
     *
     * @param ownerName 业主名称
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /**
     * 获取业主电话
     *
     * @return Owner_phone - 业主电话
     */
    public String getOwnerPhone() {
        return ownerPhone;
    }

    /**
     * 设置业主电话
     *
     * @param ownerPhone 业主电话
     */
    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    /**
     * 获取业主身份证
     *
     * @return Owner_id - 业主身份证
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * 设置业主身份证
     *
     * @param ownerId 业主身份证
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    /**
     * 获取业主邮箱
     *
     * @return Ownere_mail - 业主邮箱
     */
    public String getOwnereMail() {
        return ownereMail;
    }

    /**
     * 设置业主邮箱
     *
     * @param ownereMail 业主邮箱
     */
    public void setOwnereMail(String ownereMail) {
        this.ownereMail = ownereMail == null ? null : ownereMail.trim();
    }

    /**
     * 获取车位
     *
     * @return Owner_car - 车位
     */
    public String getOwnerCar() {
        return ownerCar;
    }

    /**
     * 设置车位
     *
     * @param ownerCar 车位
     */
    public void setOwnerCar(String ownerCar) {
        this.ownerCar = ownerCar == null ? null : ownerCar.trim();
    }

    /**
     * 获取入住时间
     *
     * @return Owner_time - 入住时间
     */
    public Date getOwnerTime() {
        return ownerTime;
    }

    /**
     * 设置入住时间
     *
     * @param ownerTime 入住时间
     */
    public void setOwnerTime(Date ownerTime) {
        this.ownerTime = ownerTime;
    }
}