package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetProfessorByIdResult;
import ucr.ac.cr.project.SelectStudentResult;

@Repository
public interface ProfessorByIdRepository extends JpaRepository<GetProfessorByIdResult, Integer> {
    @Query(value = "{call GetProfessorById(:Id)}", nativeQuery = true)
    GetProfessorByIdResult getProfessorById(@Param("Id") Integer Id);
}


