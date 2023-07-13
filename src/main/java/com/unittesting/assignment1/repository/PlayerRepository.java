package com.unittesting.assignment1.repository;

import com.unittesting.assignment1.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

  Player findByPlayerName(String playerName);
}
