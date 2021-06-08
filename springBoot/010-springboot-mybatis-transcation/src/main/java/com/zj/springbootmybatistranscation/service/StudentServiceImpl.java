package com.zj.springbootmybatistranscation.service;

import com.zj.springbootmybatistranscation.mapper.StudentMapper;
import com.zj.springbootmybatistranscation.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateStu(Student student) {
        int i = studentMapper.updateByPrimaryKey(student);
        int a = 10/0;
        return i;
    }
}
