package net.ims.repo;

import net.ims.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository


public interface CargoRepo extends JpaRepository<Cargo, Integer> {

}
