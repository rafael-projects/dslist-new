package com.dslist.project.dslist.service;


import com.dslist.project.dslist.DTO.GameDTO;
import com.dslist.project.dslist.DTO.GameMinDTO;
import com.dslist.project.dslist.entities.Game;
import com.dslist.project.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findBYId(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return  result.stream().map(GameMinDTO::new).toList();
    }

    /*
    public List<GameMinDTO> FindByGameList( Long listId){

    }*/
}
