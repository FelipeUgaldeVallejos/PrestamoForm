package org.example.prestamoform.data;

import org.example.prestamoform.logic.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, String> {

    @Query("select p from Prestamo p where p.nombre like %?1%")
    public List<Prestamo> findByNombre(String nombre);
}
