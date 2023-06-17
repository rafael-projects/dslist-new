package com.dslist.project.dslist.repository;


import com.dslist.project.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,  Long> {
}
