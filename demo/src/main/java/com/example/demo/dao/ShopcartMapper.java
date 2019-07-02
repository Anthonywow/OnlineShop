package com.example.demo.dao;

import com.example.demo.entity.Shopcart;
import com.example.demo.entity.ShopcartExample;
import java.util.List;

public interface ShopcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
}