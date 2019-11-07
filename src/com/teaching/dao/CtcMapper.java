package com.teaching.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teaching.bean.Ctc;
import com.teaching.bean.CtcExample;
import com.teaching.bean.CtcKey;
import com.teaching.vo.CtcView;

public interface CtcMapper {
    int countByExample(CtcExample example);

    int deleteByExample(CtcExample example);

    int deleteByPrimaryKey(CtcKey key);

    int insert(Ctc record);

    int insertSelective(Ctc record);

    List<Ctc> selectByExample(CtcExample example);

    Ctc selectByPrimaryKey(CtcKey key);

    int updateByExampleSelective(@Param("record") Ctc record, @Param("example") CtcExample example);

    int updateByExample(@Param("record") Ctc record, @Param("example") CtcExample example);

    int updateByPrimaryKeySelective(Ctc record);

    int updateByPrimaryKey(Ctc record);
    int savectc(List<Ctc> ctcList);
	List<CtcView> getPk(int cid);
}