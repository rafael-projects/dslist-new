package com.dslist.project.dslist.service;

import com.dslist.project.dslist.DTO.GameListDTO;
import com.dslist.project.dslist.entities.GameList;
import com.dslist.project.dslist.repository.GameListRepository;
import com.dslist.project.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
