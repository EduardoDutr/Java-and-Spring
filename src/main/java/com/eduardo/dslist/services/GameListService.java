package com.eduardo.dslist.services;

import com.eduardo.dslist.dto.GameListDTO;
import com.eduardo.dslist.entities.GameList;
import com.eduardo.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x ->new GameListDTO(x)).toList();
    }
}
