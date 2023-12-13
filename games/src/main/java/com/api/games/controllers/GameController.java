package com.api.games.controllers;

import com.api.games.dtos.GameDTO;
import com.api.games.services.GameService;
import com.api.games.entities.Game;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

   private final GameService gameService;

   public GameController(GameService gameService) {
      this.gameService = gameService;
   }

   @GetMapping
   public ResponseEntity<List<GameDTO>> findAll(){
      return ResponseEntity.status(HttpStatus.OK).body(gameService.findAll());
   }

   @GetMapping(value = "/{id}")
   public ResponseEntity<Game> findById(@PathVariable(value = "id") Long id){
      var game = gameService.findById(id);
      return ResponseEntity.of(game);
   }
}
