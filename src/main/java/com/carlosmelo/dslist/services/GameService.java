package com.carlosmelo.dslist.services;

import com.carlosmelo.dslist.dto.GameDTO;
import com.carlosmelo.dslist.dto.GameMinDTO;
import com.carlosmelo.dslist.entities.Game;
import com.carlosmelo.dslist.projections.GameMinProjection;
import com.carlosmelo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listID) {
        List<GameMinProjection> result = gameRepository.searchByList(listID);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
