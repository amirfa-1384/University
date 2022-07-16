package ir.pt.univrsity.Model.base;

import ir.pt.univrsity.Model.base.Enum.Gender;
import lombok.Data;

import java.util.Date;

@Data
@Su
public abstract class Person {
    private String Name;
    private String Family;
    private String FatherName;
    private String NationalCode;
    private Date BirthDate;
    private Gender gender;
    private String LastEducation;
}
