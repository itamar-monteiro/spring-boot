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
   @Getter @Setter private Long id;
   @Getter @Setter private String title;
   @Getter @Setter private Double score;

   @Column(name = "game_year")
   @Getter @Setter
   private Integer year;

   @Getter @Setter
   private String genre;

   @Getter @Setter
   private String platforms;

   @Getter @Setter
   private String imgUrl;

   @Column(columnDefinition = "TEXT")
   @Getter @Setter
   private String shortDescription;

   @Column(columnDefinition = "TEXT")
   @Getter @Setter
   private String longDescription;
}
