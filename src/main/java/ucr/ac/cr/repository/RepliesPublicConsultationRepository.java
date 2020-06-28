package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetRepliesPublicConsultation;
import ucr.ac.cr.project.Location;

import java.util.List;

@Repository
public interface RepliesPublicConsultationRepository extends JpaRepository<GetRepliesPublicConsultation, Integer> {
    @Query(value = "{call GetRepliesPublicConsultation(:PublicConsultationId)}", nativeQuery = true)
    List<GetRepliesPublicConsultation> GetRepliesPublicConsultation(@Param("PublicConsultationId") Integer PublicConsultationId);
}
