package com.krendel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "restapi_roles")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "base_id"))
})
public class Role extends BaseModel implements Serializable {

    private static final long serialVersionUID = -1938567246027507296L;


    @Column(name = "role_name")
    private String name;

    @Column(name = "role_key")
    private String roleKey;

    @Column(name = "is_active")
    private boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


}
