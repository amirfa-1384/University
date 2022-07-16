package ir.pt.univrsity.Model.Dao;

import ir.pt.univrsity.Model.Entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherDao extends CrudRepository<Teacher,Long> {

}
