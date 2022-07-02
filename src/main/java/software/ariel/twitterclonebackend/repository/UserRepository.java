package software.ariel.twitterclonebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import software.ariel.twitterclonebackend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
