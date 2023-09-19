package com.rkapp.domain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "item_details")
@Data

public class ItemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iditem_details")
    private Integer iditem_details;

    @Column(name="item_code")
    private Integer item_code;

    @Column(name="item_name")
    private String item_name;

    @Column(name="base_price")
    private String base_price;

    @Column(name="item_category")
    private String item_category; //SL

    @Column(name="added_date")
    private String added_date;

    @Column(name="added_by")
    private String added_by;

    @Column(name="terminate_date")
    private String terminate_date;


}
