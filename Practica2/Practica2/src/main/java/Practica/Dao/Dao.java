package Practica.Dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    /** Recibe un objeto YA CREADO, y lo guarda en la base de datos */
    void save(T t) throws Exception;

    void update(T t, String[] params);

    void delete(T t);

    
} 
