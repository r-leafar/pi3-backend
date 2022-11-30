package br.com.pi3.API.repository;

import br.com.pi3.API.entity.SegmentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentoRepository extends JpaRepository<SegmentoEntity,Long> {
}
