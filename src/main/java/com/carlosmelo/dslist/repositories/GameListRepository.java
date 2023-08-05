package com.carlosmelo.dslist.repositories;
import com.carlosmelo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameListRepository extends JpaRepository<GameList, Long> {
}
