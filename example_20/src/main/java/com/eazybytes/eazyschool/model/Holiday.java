package com.eazybytes.eazyschool.model;

import jakarta.persistence.*;

@Entity
@Table(name = "holidays")
public class Holiday extends BaseEntity{

    @Id
    private String day;

    private String reason;
    @Enumerated(EnumType.STRING)
    private Type type;

    // ✅ Default constructor (REQUIRED by Spring's BeanPropertyRowMapper)
    public Holiday() {
    }

    // ✅ All-args constructor (optional, useful if needed manually)
    public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

    // ✅ Getters and setters
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    // ✅ Enum definition
    public enum Type {
        FESTIVAL, FEDERAL
    }
}
