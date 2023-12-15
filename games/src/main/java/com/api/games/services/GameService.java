package com.api.games.services;

import com.api.games.dtos.GameDTO;
import com.api.games.entities.Game;
import com.api.games.repositories.GameRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class GameService {
   private final GameRepository gameRepository;

   public GameService(GameRepository gameRepository){
      this.gameRepository = gameRepository;
   }
   public Page<GameDTO> findAll(){
      Pageable pageable = PageRequest.of(0, 3, Sort.by("title"));
      Page<Game> games = gameRepository.findAll(pageable);
      return games.map(new Function<Game, GameDTO>() {
         @Override
         public GameDTO apply(Game game) {
            return new GameDTO(game);
         }
      });
   }

   public Optional<Game> findById(Long id){
      Optional<Game> game = gameRepository.findById(id);
      if (game.isPresent()){
         return game;
      }
      return null;
   }
}
