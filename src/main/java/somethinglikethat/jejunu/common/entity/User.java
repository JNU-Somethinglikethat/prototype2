package somethinglikethat.jejunu.common.entity;

import org.hibernate.usertype.UserType;

import javax.persistence.*;

/**
 * Created by replay on 2017. 6. 3..
 */

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_no")
    private Long no;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private UserType userType;

    @Column(name = "password", length = 100, nullable = false)
    private String password;
}
