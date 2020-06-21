package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.Student;
import ucr.ac.cr.project.Users;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    @Query(value = "SelectUsers", nativeQuery = true)
    List<Users> getAllUsers();
}
