package ambigoush.bagasee.repository;

import ambigoush.bagasee.model.SellerBaggage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SellerBaggage, Long> {
    Optional<SellerBaggage> findByEmail(String email);

    Optional<SellerBaggage> findByUsernameOrEmail(String username, String email);
    List<SellerBaggage> findByIdIn(List<Long> userIds);

    Optional<SellerBaggage> findUsername(String user_name);

    Boolean existsByUsername(String user_name);

    Boolean existsByEmail(String user_email);
}
