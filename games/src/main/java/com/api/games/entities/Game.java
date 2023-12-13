package com.api.games.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Builder
@Entity
@Table(name = "tb_game")
public class Game {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private Double score;

   @Column(name = "game_year")
   private Integer year;

   private String genre;

   private String platforms;

   private String imgUrl;

   @Column(columnDefinition = "TEXT")
   private String shortDescription;

   @Column(columnDefinition = "TEXT")
   private String longDescription;
}