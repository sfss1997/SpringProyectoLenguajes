package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.SelectStudentResult;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

@Repository
public interface AllStudentsRepository extends JpaRepository<SelectStudentResult, Integer> {

    @Query(value = "SelectStudent", nativeQuery = true)
    List<SelectStudentResult> ListAllStudents();
}
