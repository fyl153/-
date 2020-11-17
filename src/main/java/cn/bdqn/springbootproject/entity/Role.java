package cn.bdqn.springbootproject.entity;

import java.util.Date;

public class Role {
    private Integer id;
    private String roleName;
    private  String roleCode;
    private Integer createBy;
    private Date creationDate;

    public Role(){}
    public Role(Integer id, String roleName, String roleCode, Integer createBy, Date creationDate) {
        this.id = id;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.createBy = createBy;
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
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
