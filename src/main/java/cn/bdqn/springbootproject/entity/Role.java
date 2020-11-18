package cn.bdqn.springbootproject.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Role {
    private Integer id;
    private String roleName;
    private  String roleCode;
    private Integer createdBy;
    private Date creationDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date modifyDate;

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Role(){}
    public Role(Integer id, String roleName, String roleCode, Integer createdBy, Date creationDate) {
        this.id = id;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getCreateBy() {
        return createdBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createdBy = createBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
