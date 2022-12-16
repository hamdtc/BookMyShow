package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.TheaterSeatEntity;
import com.example.BookMyShow.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatRepository extends JpaRepository<TheaterSeatEntity,Integer> {
}
