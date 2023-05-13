package com.eduardo.dslist.repositories;

import com.eduardo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList,Long>{

}
