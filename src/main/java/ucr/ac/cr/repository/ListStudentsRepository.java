package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.ListStudentResult;

import java.util.List;

@Repository
public interface ListStudentsRepository extends JpaRepository<ListStudentResult, Integer> {

    @Query(value = "ListStudent", nativeQuery = true)
    List<ListStudentResult> ListStudents();
}
