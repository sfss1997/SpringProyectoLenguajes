package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetStudentCoursesResult;
import ucr.ac.cr.project.Location;

import java.util.List;
@Repository
public interface StudentCoursesRepository extends JpaRepository<GetStudentCoursesResult, Integer> {
    @Query(value = "{call GetStudentCourses(:Id)}", nativeQuery = true)
    List<GetStudentCoursesResult> GetStudentCourses(@Param("Id") Integer Id);

}
