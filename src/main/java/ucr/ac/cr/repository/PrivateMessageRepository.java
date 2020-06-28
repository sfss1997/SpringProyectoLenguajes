package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetPrivateMessageResult;
import ucr.ac.cr.project.Location;

import java.util.List;

@Repository
public interface PrivateMessageRepository extends JpaRepository<GetPrivateMessageResult, Integer> {
    @Query(value = "{call GetPrivateMessage(:CourseId, :ProfessorId)}", nativeQuery = true)
    List<GetPrivateMessageResult> GetPrivateMessage(@Param("CourseId") Integer CourseId,
                                                    @Param("ProfessorId") Integer ProfessorId);
}
