package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetSocialNetworksByIdResult;
import ucr.ac.cr.project.SelectStudentResult;

import java.util.List;

@Repository
public interface SocialNetworksStudentRepository extends JpaRepository<GetSocialNetworksByIdResult, Integer> {

    @Query(value = "{call GetSocialNetworksByIdStudent(:Id)}", nativeQuery = true)
    List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(@Param("Id") Integer Id);
}
