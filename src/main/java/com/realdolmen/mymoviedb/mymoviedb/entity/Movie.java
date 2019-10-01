package com.realdolmen.mymoviedb.mymoviedb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="movie")
@Data
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="external_id")
    private int externalId;

    @Column(name="title")
    private String title;

    @Column(name="poster_path")
    private String posterPath;

    @Column(name="seen")
    private Boolean seen;

    @Version
    private int version;

}











