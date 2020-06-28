package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetProfessorByIdCourseResult;
import ucr.ac.cr.project.Location;

@Repository
public interface ProfessorCourseRepository extends JpaRepository<GetProfessorByIdCourseResult, Integer> {
    @Query(value = "{call GetProfessorByIdCourse(:Id)}", nativeQuery = true)
    GetProfessorByIdCourseResult GetProfessorByIdCourse(@Param("Id") Integer Id);
}
