package com.eventostec.api.domain.coupon;

import java.sql.Date;
import java.util.UUID;

import com.eventostec.api.domain.event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "coupon")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    
    @Id
    @GeneratedValue
    private UUID id;
    
    private String code;
    private Integer discount;
    private Date valid;

    @ManyToOne()
    @JoinColumn(name = "event_id")
    private Event event;
}
