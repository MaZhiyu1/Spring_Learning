package com.eazybytes.eazyschool.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "holidays")
public class Holiday extends BaseEntity {


    @Id
    private String day;

    private String reason;

    @Enumerated(EnumType.STRING)   //String enum
    private Type type;

    public enum Type {
        FESTIVAL, FEDERAL
    }
}
