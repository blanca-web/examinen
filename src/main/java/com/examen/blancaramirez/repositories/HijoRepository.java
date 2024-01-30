package com.examen.blancaramirez.repositories;

import java.util.List;

public interface HijoRepository {
    HijoRepository save(HijoRepository hijoRepository);
    HijoRepository findById(Long id);
    void deleteById(Long id);
    List<HijoRepository> findAll();
    List<HijoRepository> findByNombre(String nombre);

}


@Repository
public interface HijoRepository extends JpaRepository<HijoRepository, Long> {
    @Query(value = "SELECT * FROM hijos WHERE nombre = ?1", nativeQuery = true)
    List<HijoRepository> findByNombre(String nombre);
}



