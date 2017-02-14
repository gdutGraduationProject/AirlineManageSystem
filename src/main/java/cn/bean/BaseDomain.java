package cn.bean;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ChenGeng on 2017/2/13.
 */
public class BaseDomain implements Serializable {

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 更新日期
     */
    private Date updateDate;

    /**
     * 修改的次数
     */
    private int version;

    /**
     * 是否标记为删除
     */
    private boolean isDelete;

    /**
     * 删除日期
     */
    private Date deleteDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    @PrePersist
    protected  void prePersist(){
        setCreateDate(new Date());
        setVersion(1);
    }

    @PreUpdate
    protected void preUpdate(){
        setUpdateDate(new Date());
        version++;
    }

}
