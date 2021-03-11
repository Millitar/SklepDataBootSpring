package pl.sklep.sklepspringdataboot.Asortyment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsortymentRepo extends CrudRepository<Asortyment,Long> {

}
