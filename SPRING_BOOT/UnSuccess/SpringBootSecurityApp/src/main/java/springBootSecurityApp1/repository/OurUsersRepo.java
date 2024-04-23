package springBootSecurityApp1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import springBootSecurityApp1.entity.OurUsers;

public interface OurUsersRepo extends JpaRepository<OurUsers, Integer> {

	Optional<OurUsers> findByEmail(String email);

}
