package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.essat.model.Pfe;

@Repository
public interface IPfe extends JpaRepository<Pfe, Integer>{
	@Query("select p from Pfe p where p.cat.id=:x")
	public List<Pfe> getAllpfebyCat(@Param("x") Integer id);
	@Query("select p from Pfe p where p.titre like %:x%")
	public List<Pfe> getAllpfebytitre(@Param("x") String  titre);
}