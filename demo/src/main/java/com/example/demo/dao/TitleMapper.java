package com.example.demo.dao;

import com.example.demo.entity.Title;
import com.example.demo.entity.TitleExample;
import java.util.List;

public interface TitleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}