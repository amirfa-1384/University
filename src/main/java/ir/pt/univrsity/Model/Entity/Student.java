package ir.pt.univrsity.Model.Entity;

import ir.pt.univrsity.Model.base.Person;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_student")
@AllArgsConstructor
public class Student extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int StudentCode;


}
