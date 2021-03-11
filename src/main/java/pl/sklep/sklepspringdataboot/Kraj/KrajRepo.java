package pl.sklep.sklepspringdataboot.Kraj;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KrajRepo extends CrudRepository<Kraj,Integer> {
}
