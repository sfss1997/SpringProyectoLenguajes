package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetRepliesPrivateMessageResult;
import ucr.ac.cr.project.Location;

import java.util.List;

@Repository
public interface RepliesPrivateMessageRepository extends JpaRepository<GetRepliesPrivateMessageResult, Integer> {
    @Query(value = "{call GetRepliesPrivateMessage(:PrivateMessageId)}", nativeQuery = true)
    List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(@Param("PrivateMessageId") Integer PublicConsultationId);
}
