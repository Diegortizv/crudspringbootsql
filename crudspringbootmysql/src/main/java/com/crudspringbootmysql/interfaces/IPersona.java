package com.crudspringbootmysql.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.crudspringbootmysql.modelo.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
    
    
}
