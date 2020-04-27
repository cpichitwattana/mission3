package chanbrightt.mission3.repository;

import chanbrightt.mission3.model.BurgerMenu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BurgerRepository extends JpaRepository<BurgerMenu, Integer>{

}
