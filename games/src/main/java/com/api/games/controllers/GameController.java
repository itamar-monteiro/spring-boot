package com.api.games.controllers;

import com.api.games.GameService;
import com.api.games.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
   @Autowired
   private GameService gameService;

   @GetMapping(value = "/games")
   public List<Game> findAll(){
      return gameService.findAll();
   }
}
