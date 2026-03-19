package com.igbeltsys.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.igbeltsys.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
