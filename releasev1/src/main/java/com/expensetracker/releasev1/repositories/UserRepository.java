package com.expensetracker.releasev1.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.expensetracker.releasev1.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	void deleteUserById(Long id);
	
	Optional<User> findUserById(Long id);
}
