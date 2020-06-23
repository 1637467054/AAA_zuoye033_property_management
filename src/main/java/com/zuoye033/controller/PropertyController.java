package com.zuoye033.controller;

import com.zuoye033.entity.ResultData;
import com.zuoye033.entity.TabOwner;
import com.zuoye033.entity.TabRoom;
import com.zuoye033.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @ResponseBody
    @RequestMapping("/selectOwner")
    ResultData selectOwner(){
        List<TabOwner> list=propertyService.selectOwner();
//        System.out.println(list);
        if (list!=null){
            return new ResultData(true,"查询成功",list);
        }else {
            return new ResultData(false,"查询失败",null);
        }
    }

    @ResponseBody
    @RequestMapping("/selectRoom")
    ResultData selectRoom(){
        List<TabRoom> list=propertyService.selectRoom();
//        System.out.println(list);
        if (list!=null){
            return new ResultData(true,"查询成功",list);
        }else {
            return new ResultData(false,"查询失败",null);
        }
    }

    @ResponseBody
    @RequestMapping("/insertOwner")
    ResultData insertOwner(@RequestBody TabOwner tabOwner){
        int i=propertyService.insertOwner(tabOwner);
        if (i>0){
            return new ResultData(true,"查询成功",null);
        }else {
            return new ResultData(false,"查询失败",null);
        }
    }
}
