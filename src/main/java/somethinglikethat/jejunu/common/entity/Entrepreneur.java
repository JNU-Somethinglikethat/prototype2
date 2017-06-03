package somethinglikethat.jejunu.common.entity;

import javax.persistence.Column;

/**
 * Created by replay on 2017. 6. 3..
 */
public class Entrepreneur {

    @Column(name = "student_email_verification", length = 1)
    private String student_email_verification;

    @Column(name = "company_name", length = 50, nullable = false)
    private String companyName;
}
