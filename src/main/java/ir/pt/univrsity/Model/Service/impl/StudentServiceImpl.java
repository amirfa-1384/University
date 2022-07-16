package ir.pt.univrsity.Model.Service.impl;

import ir.pt.univrsity.Model.Dao.IStudentDao;
import ir.pt.univrsity.Model.Entity.Student;
import ir.pt.univrsity.Model.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao repo;


    @Override
    public Student save(Student student) {
        return repo.save(student);
    }

}
