package somethinglikethat.jejunu.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by replay on 2017. 6. 3..
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_no")
    private Long no;

    @Column(name = "category_name", nullable = false)
    private String name;
}
