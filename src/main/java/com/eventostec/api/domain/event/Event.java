package com.eventostec.api.domain.event;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "event")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    
    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String description;
    
    private String imgUrl;
    
    private String eventUrl;
    
    private Boolean remote;
    
    private Date date;
}
