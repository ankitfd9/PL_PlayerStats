package com.springtest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springtest.demo.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {

    List<Player> findByNation(String nation);

    List<Player> findAllByNationAndPosition(String nation, String position);

    List<Player> findAllByClubAndPosition(String club, String position);

}
