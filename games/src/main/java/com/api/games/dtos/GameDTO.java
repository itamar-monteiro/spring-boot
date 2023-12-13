package com.api.games.dtos;

import com.api.games.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GameDTO {
   private String title;
   private Double score;
   private Integer year;
   private String genre;
   private String imgUrl;
   private String shortDescription;
   private String longDescription;

   public GameDTO(Game game) {
      BeanUtils.copyProperties(game, this);
   }
}
