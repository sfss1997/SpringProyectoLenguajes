package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetStudentByIdResult;
import ucr.ac.cr.project.SelectStudentResult;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface StudentByIdRepository extends JpaRepository<GetStudentByIdResult, Integer> {

    @Query(value = "{call GetStudentById(:Id)}", nativeQuery = true)
    GetStudentByIdResult getStudentById(@Param("Id") Integer Id);
}
