package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.SelectProfessorResult;

import java.util.List;

@Repository
public interface ListProfessorsRepository extends JpaRepository<SelectProfessorResult, Integer> {
    @Query(value = "SelectProfessor", nativeQuery = true)
    List<SelectProfessorResult> ListAllProfessors();
}
