package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.ShowSeatsEntity;
import com.example.BookMyShow.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatsRepository extends JpaRepository<ShowSeatsEntity,Integer> {
}
