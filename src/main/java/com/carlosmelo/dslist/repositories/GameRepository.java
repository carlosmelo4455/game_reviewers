package com.carlosmelo.dslist.repositories;

import com.carlosmelo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
