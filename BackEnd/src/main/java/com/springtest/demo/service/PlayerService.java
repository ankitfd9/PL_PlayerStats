package com.springtest.demo.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.springtest.demo.dto.PlayerResponseDto;
import com.springtest.demo.entity.Player;
import com.springtest.demo.mapper.PlayerMapper;
import com.springtest.demo.repository.PlayerRepository;

@Service
public class PlayerService {

    PlayerRepository playerRepository;
    PlayerMapper playerMapper;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
        this.playerMapper = new PlayerMapper();
    }

    public PlayerResponseDto addPlayer (PlayerResponseDto dto){
        Player player = playerMapper.toEntity(dto);

        Player saved =  playerRepository.save(player);

        return playerMapper.toDto(saved);
    }

    public List<PlayerResponseDto> getPlayerByName(String name){
        List<Player> players = playerRepository.findAll().stream()
                        .filter(p->p.getName().toLowerCase().contains(name.toLowerCase()))
                        .collect(Collectors.toList());
        return players.stream()
        .map(player->playerMapper.toDto(player))
        .collect(Collectors.toList());
    }

    public List<PlayerResponseDto> findByNation(String nation) {
        List<Player> players = playerRepository.findAll().stream()
                        .filter(p->p.getNation().toLowerCase().contains(nation.toLowerCase()))
                        .collect(Collectors.toList());
        return players.stream()
        .map(player->playerMapper.toDto(player))
        .collect(Collectors.toList());
    }

    public List<PlayerResponseDto> findByClub(String club) {
        List<Player> players = playerRepository.findAll().stream()
                        .filter(p->p.getClub().toLowerCase().contains(club.toLowerCase()))
                        .collect(Collectors.toList());
        return players.stream()
        .map(player->playerMapper.toDto(player))
        .collect(Collectors.toList());
    }

    public List<PlayerResponseDto> findByNationAndPosition(String nation, String position) {
        List<Player> players = playerRepository.findAll().stream()
                .filter(player -> nation.equals(player.getNation()) && position.equals(player.getPosition()))
                .collect(Collectors.toList());
        return players.stream()
        .map(player->playerMapper.toDto(player))
        .collect(Collectors.toList());
    }

    public List<PlayerResponseDto> findByClubAndPostion(String club, String position) {
        List<Player> players = playerRepository.findAll().stream()
                .filter(player -> club.equals(player.getClub()) && position.equals(player.getPosition()))
                .collect(Collectors.toList());
        return players.stream()
        .map(player->playerMapper.toDto(player))
        .collect(Collectors.toList());
    }

    
}
