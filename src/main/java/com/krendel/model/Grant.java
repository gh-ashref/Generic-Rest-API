package com.krendel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "restapi_grants")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "grant_id"))
})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Grant extends BaseModel implements Serializable {

    private static final long serialVersionUID = 4192997147639777673L;


    @Column(name = "grant_name")
    private String name;

    @Column(name = "grant_key")
    private String grantKey;

}
