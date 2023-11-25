package com.api.games;

import com.api.games.entities.Game;
import com.api.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
   @Autowired
   private GameRepository gameRepository;

   public List<Game> findAll(){
      List<Game> result = gameRepository.findAll();
      return result;
   }
}