package com.ls.dao;

import com.ls.pojo.Vodie;
import com.ls.pojo.VodieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VodieMapper {
    int countByExample(VodieExample example);

    int deleteByExample(VodieExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Vodie record);

    int insertSelective(Vodie record);

    List<Vodie> selectByExample(VodieExample example);

    Vodie selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Vodie record, @Param("example") VodieExample example);

    int updateByExample(@Param("record") Vodie record, @Param("example") VodieExample example);

    int updateByPrimaryKeySelective(Vodie record);

    int updateByPrimaryKey(Vodie record);
}