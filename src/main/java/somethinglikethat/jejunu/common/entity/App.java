package somethinglikethat.jejunu.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by replay on 2017. 6. 3..
 */

@Data
@Entity
public class App {
    @Id
    @GeneratedValue
    @Column(name = "app_no")
    private Long no;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "uploader_no", referencedColumnName = "user_no")
    private Student uploader;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "version", length = 20, nullable = false)
    private String version;

    @Column(name = "volume", nullable = false)
    private Integer volume;

    @ManyToOne
    @JoinColumn(name = "category_no")
    private Category category;

    @Column(name = "Apkstorage", length = 256, nullable = false)
    private String Apkstorage;

    @Column(name="screenShotUrl",  length = 256)
    private String screenShotUrl;

    @Column(name = "view_count")
    private Integer viewCount;

    @Column(name = "download_count")
    private Integer downloadCount;

    @Column(name = "stared")
    private Integer stared;

    @Column(name = "fund_goal", nullable = false)
    private Integer fundGoalAmount;

    @Column(name = "fund_amount")
    private Integer fundedAmount;

    @Column(name = "register_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @Column(name = "update_date")
    private Date updateDate;
}
