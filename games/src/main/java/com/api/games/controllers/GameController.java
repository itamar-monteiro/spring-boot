package com.api.games.controllers;

import com.api.games.services.GameService;
import com.api.games.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

   private final GameService service;

   public GameController(GameService service) {
      this.service = service;
   }

   @GetMapping
   public ResponseEntity<List<Game>> findAll(){
      return ResponseEntity.ok(service.findAll());
   }

   @GetMapping(value = "/{id}")
   public ResponseEntity<Game> findById(@PathVariable(value = "id") Long id){
      var game = service.findById(id);
      return ResponseEntity.of(game);
   }
}
