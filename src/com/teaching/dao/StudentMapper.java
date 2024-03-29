package com.teaching.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.teaching.bean.Student;
import com.teaching.bean.StudentExample;
import com.teaching.vo.CtcView;
import com.teaching.vo.GradeView;
import com.teaching.vo.StuExt;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<StuExt> getStu(Map map);
    
    List<CtcView> getXx(int claid);
    
    List<CtcView> getkb(Student stu);
    
    List<GradeView> getGrade(int sid);
}