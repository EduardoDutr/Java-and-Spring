package com.eduardo.dslist.services;

import com.eduardo.dslist.dto.GameDTO;
import com.eduardo.dslist.dto.GameMinDTO;
import com.eduardo.dslist.entities.Game;
import com.eduardo.dslist.projections.GameMinProjection;
import com.eduardo.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId){
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
        //tratar erros
    }
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
        return dto;
    }
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x ->new GameMinDTO(x)).toList();
    }
}
