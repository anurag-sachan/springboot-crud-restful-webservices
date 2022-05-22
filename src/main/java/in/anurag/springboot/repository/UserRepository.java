package in.anurag.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.anurag.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
 
}
