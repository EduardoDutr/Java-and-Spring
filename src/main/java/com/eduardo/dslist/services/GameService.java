package com.eduardo.dslist.services;

import com.eduardo.dslist.dto.GameMinDTO;
import com.eduardo.dslist.entities.Game;
import com.eduardo.dslist.repositories.GameRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
        return dto;
    }
}
