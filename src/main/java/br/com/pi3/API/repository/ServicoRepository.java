package br.com.pi3.API.repository;

import br.com.pi3.API.entity.ServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<ServicoEntity,Long> {

    public List<ServicoEntity> findServicoEntitiesBySegmentoIdsegmento(Long id);
}
