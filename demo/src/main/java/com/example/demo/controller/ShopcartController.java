package com.example.demo.controller;

import com.example.demo.dao.ShopcartMapper;
import com.example.demo.entity.Shopcart;
import com.example.demo.entity.ShopcartExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/shopcart")
public class ShopcartController {

    @Autowired
    ShopcartMapper shopcartMapper;
    Map<String, Object> map;

    @PostMapping(value = "/addshopcart")
    public Map<String, Object> addshopcart(
            String src,
            String title,
            float unit_price,
            int number,
            float sum_price){
        map = new HashMap<>();
        map.put("success", true);
        Shopcart shopcart = new Shopcart();
        shopcart.setSrc(src);
        shopcart.setTitle(title);
        shopcart.setUnitPrice(unit_price);
        shopcart.setNumber(number);
        shopcart.setSumPrice(sum_price);
        shopcartMapper.insert(shopcart);
        return map;
    }

    @GetMapping(value = "/showshopcart")
//    public Map<String, Object> showshopcart(){
//        map = new HashMap<>();
//        List<Shopcart> list = new ArrayList();
//        ShopcartExample shopcartExample = new ShopcartExample();
//        list = shopcartMapper.selectByExample(shopcartExample);
//        map.put("shopcartlist", list);
//        return map;
//    }
    public List<Shopcart> showshopcart(){
        ShopcartExample shopcartExample = new ShopcartExample();//表示全部对象
        List<Shopcart> list = shopcartMapper.selectByExample(shopcartExample);
        return list;
    }

    @DeleteMapping(value = "/deleteWareOfShopcart")
    public Map<String,Object> deleteWareOfShopcart(int id){
        map = new HashMap<>();
        int message = shopcartMapper.deleteByPrimaryKey(id);
        if(message>0) {
            map.put("success", true);
        }else{
            map.put("success", false);
        }
        return map;
    }
}
