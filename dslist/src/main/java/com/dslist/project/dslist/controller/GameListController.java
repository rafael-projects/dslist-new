package com.dslist.project.dslist.controller;

import com.dslist.project.dslist.DTO.GameListDTO;
import com.dslist.project.dslist.DTO.GameMinDTO;
import com.dslist.project.dslist.entities.GameList;
import com.dslist.project.dslist.service.GameListService;
import com.dslist.project.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
         List<GameListDTO> result = gameListService.findAll();
         return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO>  findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }





}
