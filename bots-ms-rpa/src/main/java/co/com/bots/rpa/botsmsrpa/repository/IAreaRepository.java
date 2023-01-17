package co.com.bots.rpa.botsmsrpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.bots.rpa.botsmsrpa.entity.Area;

@Repository
public interface IAreaRepository extends JpaRepository<Area, Long>{

}
