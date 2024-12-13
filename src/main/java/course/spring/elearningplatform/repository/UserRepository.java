package course.spring.elearningplatform.repository;

import course.spring.elearningplatform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boo existsByUsername(String username);
    boolean existsByEmail(String email);

    Optional<User> findByUsername(String username);
}
