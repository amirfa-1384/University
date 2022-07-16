package ir.pt.univrsity.Model.Service;

import ir.pt.univrsity.Model.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {
    public Student save(Student student);
//    public Student getStudentId(Long id);
//    public List<Student> getAllStudent();
//    public void Update(Student student);
//    public void deleteStudentId(Long id);

}
