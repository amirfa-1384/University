package ir.pt.univrsity.Model.Service;

import ir.pt.univrsity.Model.Entity.Student;
import ir.pt.univrsity.Model.Entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface ITeacherService {
    public Teacher save(Teacher teacher);

}
