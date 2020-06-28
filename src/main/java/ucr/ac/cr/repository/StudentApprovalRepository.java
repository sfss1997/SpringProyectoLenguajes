package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.StudentApprovalResult;

import java.util.List;

@Repository
public interface StudentApprovalRepository extends JpaRepository<StudentApprovalResult, Integer> {

    @Query(value = "StudentApproval", nativeQuery = true)
    List<StudentApprovalResult> ListStudentApproval();
}
