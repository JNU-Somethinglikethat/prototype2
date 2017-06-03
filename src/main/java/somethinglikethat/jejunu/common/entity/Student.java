package somethinglikethat.jejunu.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by replay on 2017. 6. 3..
 */

@Data
@Entity
public class Student extends User {
    @Column(name = "student_email_verification", length = 1)
    private String student_email_verification;
}
