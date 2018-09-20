package com.cofeeshop.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Beverage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer beverageId;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    private Date updateDate;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String beverageType;

    public void setBeverageId(Integer beverageId) {
        this.beverageId = beverageId;
    }

    public void setBeverageType(String beverageType) {
        this.beverageType = beverageType;
    }

    public Integer getBeverageId() {
        return beverageId;
    }

    public String getBeverageType() {
        return beverageType;
    }


}
