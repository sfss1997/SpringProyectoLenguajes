package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetPublicConsultationResult;
import ucr.ac.cr.project.Location;

import java.util.List;

@Repository
public interface PublicConsultationRepository extends JpaRepository<GetPublicConsultationResult, Integer> {
    @Query(value = "{call GetPublicConsultation(:CourseId, :ProfessorId)}", nativeQuery = true)
    List<GetPublicConsultationResult> GetPublicConsultation(@Param("CourseId") Integer CourseId,
                                                            @Param("ProfessorId") Integer ProfessorId);
}
