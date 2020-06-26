package com.krendel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "restapi_roles")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "base_id"))
})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role extends BaseModel implements Serializable {

    private static final long serialVersionUID = -1938567246027507296L;

    @Column(name = "role_name")
    private String name;

    @Column(name = "role_key")
    private String roleKey;

    @Column(name = "is_active")
    private boolean isActive;

}
