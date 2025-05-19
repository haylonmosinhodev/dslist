package com.devsupeior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsupeior.dslist.dto.GameMinDTO;
import com.devsupeior.dslist.entities.Game;
import com.devsupeior.dslist.repositories.GameRepository;



@Service
public class GamesService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
	}
	
	
	
	
}
