package com.obs.entities.core;

import javax.persistence.*;

/**
 * Created by Ramazan Karagoz on 8.06.2017.
 */
@Entity
@Table(name = "ROLE")
public class Role extends BaseEntity{

    @Column(name ="CODE")
    private String code;
    @Column(name = "LABEL")
    private String label;

    public Role() {
    }

    public Role(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
