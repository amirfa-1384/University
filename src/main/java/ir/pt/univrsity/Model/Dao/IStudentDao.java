package ir.pt.univrsity.Model.Dao;

import ir.pt.univrsity.Model.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDao extends CrudRepository<Student,Long> {

}
