package ambigoush.bagasee.repository;

import ambigoush.bagasee.model.UserField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserField, Long> {
    Optional<UserField> findByEmail(String email);

    Optional<UserField> findByUsernameOrEmail(String username, String email);
    List<UserField> findByIdIn(List<Long> userIds);

    Optional<UserField> findUsername(String user_name);

    Boolean existsByUsername(String user_name);

    Boolean existsByEmail(String user_email);
}
