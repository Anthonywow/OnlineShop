package com.example.demo.dao;

import com.example.demo.entity.Introduction;
import com.example.demo.entity.IntroductionExample;
import java.util.List;

public interface IntroductionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Introduction record);

    int insertSelective(Introduction record);

    List<Introduction> selectByExample(IntroductionExample example);

    Introduction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Introduction record);

    int updateByPrimaryKey(Introduction record);
}