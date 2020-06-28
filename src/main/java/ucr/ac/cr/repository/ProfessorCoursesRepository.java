package ucr.ac.cr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetProfessorCoursesResult;
import ucr.ac.cr.project.Location;

import java.util.List;

@Repository
public interface ProfessorCoursesRepository extends JpaRepository<GetProfessorCoursesResult, Integer> {

    @Query(value = "{call GetProfessorCourses(:Id)}", nativeQuery = true)
    List<GetProfessorCoursesResult> GetProfessorCourses(@Param("Id") Integer Id);
}
