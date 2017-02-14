package cn.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChenGeng on 2017/2/14.
 */
public class StaffPerms extends BaseDomain implements Serializable {

    @Id
    @GenericGenerator(name = "PKUUID", strategy = "uuid2")
    @GeneratedValue(generator = "PKUUID")
    @Column(length = 36)
    protected String id;

    /**
     * 菜单项的文字显示
     */
    private String menuText;

    /**
     * 跳转的url
     */
    private String jumpUrl;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "staff_staff_perms_links",
            joinColumns = { @JoinColumn(name = "staff_id", referencedColumnName = "id") }
            ,inverseJoinColumns  = { @JoinColumn(name = "perms_id", referencedColumnName = "id") }
            , inverseForeignKey= @ForeignKey(name = "fk_perms_links_perms")
            ,foreignKey = @ForeignKey(name = "staff_rp_links_staff_perms")
    )
    private List<Staff> staffs = new ArrayList<Staff>();

}
