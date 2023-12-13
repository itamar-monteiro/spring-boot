package com.api.games.repositories;

import com.api.games.entities.Game;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends PagingAndSortingRepository<Game, Long> {

   Optional<Game> findById(Long id);
}
