package ir.pt.univrsity.Model.Service.impl;


import ir.pt.univrsity.Model.Dao.ITeacherDao;
import ir.pt.univrsity.Model.Entity.Teacher;
import ir.pt.univrsity.Model.Service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherDao repo;


    @Override
    public Teacher save(Teacher teacher) {
        return repo.save(teacher);
    }
}
