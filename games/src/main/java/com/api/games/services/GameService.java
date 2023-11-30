package com.api.games.services;

import com.api.games.entities.Game;
import com.api.games.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
   private final GameRepository gameRepository;

   public GameService(GameRepository gameRepository){
      this.gameRepository = gameRepository;
   }
   public List<Game> findAll(){
      return gameRepository.findAll();
   }

   public Optional<Game> findById(Long id){
      return gameRepository.findById(id);
   }
}
