package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetNameSocialNetworksResult;
import ucr.ac.cr.project.SelectStudentResult;

import java.util.List;

@Repository
public interface SocialNetworkCatalogRepository extends JpaRepository<GetNameSocialNetworksResult, Integer>{
    @Query(value = "GetNameSocialNetworks", nativeQuery = true)
    List<GetNameSocialNetworksResult> ListSocialNetworksCatalog();
}
