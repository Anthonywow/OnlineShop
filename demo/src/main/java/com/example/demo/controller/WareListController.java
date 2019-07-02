package com.example.demo.controller;

import com.example.demo.dao.IntroductionMapper;
import com.example.demo.dao.ShopcartMapper;
import com.example.demo.dao.WareinfoMapper;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/wareList")
public class WareListController {

    Map<String, Object> map = new HashMap();
    @Autowired
    WareinfoMapper wareinfoMapper;

    @GetMapping(value = "/getWareList")
    public List<Wareinfo> showWareInfo(){
        WareinfoExample wareinfoExample = new WareinfoExample();    //表示全部对象
        List<Wareinfo> list_wareInfo = wareinfoMapper.selectByExample(wareinfoExample);
        return list_wareInfo;
    }

//    @GetMapping(value = "/getWareList")
//    public Map<String,Object> showWareInfo(){
//        WareinfoExample wareinfoExample = new WareinfoExample();    //表示全部对象
//        List<Wareinfo> list_wareInfo = wareinfoMapper.selectByExample(wareinfoExample);
//        map = new HashMap<>();
//        map.put("list", list_wareInfo);
//        return map;
//    }
    @GetMapping(value = "/getIntroduction/{id}")
    public Wareinfo getIntroduction(@PathVariable("id") int id){//会从url中把请求的数值赋值给id
        Wareinfo wareinfo = wareinfoMapper.selectByPrimaryKey(id);
        return wareinfo;
    }

    @DeleteMapping(value = "/deleteWare")
    public Map<String,Object> deleteWare(int id){
        map = new HashMap<>();
        int message = wareinfoMapper.deleteByPrimaryKey(id);
        if(message>0) {
            map.put("success", true);
        }else{
            map.put("success", false);
        }
        return map;
    }
}
