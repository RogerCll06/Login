package roger.demo_jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import roger.demo_jwt.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username); 
}