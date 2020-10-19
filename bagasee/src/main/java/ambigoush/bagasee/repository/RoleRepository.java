package ambigoush.bagasee.repository;

import ambigoush.bagasee.model.Role;
import ambigoush.bagasee.model.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleUser roleUser) ;
}
