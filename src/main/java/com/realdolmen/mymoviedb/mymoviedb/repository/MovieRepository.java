package com.realdolmen.mymoviedb.mymoviedb.repository;

import com.realdolmen.mymoviedb.mymoviedb.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
