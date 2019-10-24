package com.jjarfi.DAO;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "test_quest")
public class QuestDao {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "alumni_npm")
    private String alumni;
    @Column(name = "jawab_id")
    private String id;
}

