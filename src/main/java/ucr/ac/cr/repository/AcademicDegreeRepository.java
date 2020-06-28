package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.SelectAcademicDegreeResult;


import java.util.List;

@Repository
public interface AcademicDegreeRepository extends JpaRepository<SelectAcademicDegreeResult, Integer> {
    @Query(value = "SelectAcademicDegree", nativeQuery = true)
    List<SelectAcademicDegreeResult> ListAcademicDegree();
}
