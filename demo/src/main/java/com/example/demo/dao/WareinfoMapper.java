package com.example.demo.dao;

import com.example.demo.entity.Wareinfo;
import com.example.demo.entity.WareinfoExample;
import java.util.List;

public interface WareinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wareinfo record);

    int insertSelective(Wareinfo record);

    List<Wareinfo> selectByExample(WareinfoExample example);

    Wareinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wareinfo record);

    int updateByPrimaryKey(Wareinfo record);
}