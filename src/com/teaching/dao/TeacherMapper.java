package com.teaching.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.teaching.bean.Classes;
import com.teaching.bean.Major;
import com.teaching.bean.Teacher;
import com.teaching.bean.TeacherExample;
import com.teaching.vo.CtcView;
import com.teaching.vo.StuScore;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    List<CtcView> getkb(int tid);
    
    List<StuScore> getMyStu(Map map);
    List<Classes> getClass(int tid);
    
    List<Teacher> getPage(@Param("start") int start,@Param("size") int size);
    List<Teacher> getPage1();
    List<Teacher> getAll1(TeacherExample example);
}