package com.eduardo.dslist.repositories;

import com.eduardo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game,Long>{

}
