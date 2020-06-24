package ucr.ac.cr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.*;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

    @Modifying
    @Query(value = "{ call InsertUpdateProfessor(:Id, :Username, :Password, :IsAdministrator, :Status, :Name, :LastName, :Mail, :Image, :ProvinceId, :CantonId, :DistrictId, :AcademicDegree ,'Insert')}", nativeQuery = true)
    void addProfessor(@Param("Id") Integer Id,
                    @Param("Username") String Username,
                    @Param("Password") String Password,
                    @Param("IsAdministrator") Integer IsAdministrator,
                      @Param("Status") String Status,
                    @Param("Name") String Name,
                      @Param("LastName") String LastName,
                    @Param("Mail") String Mail,
                    @Param("Image") String Image,
                    @Param("ProvinceId") Integer ProvinceId,
                    @Param("CantonId") Integer CantonId,
                    @Param("DistrictId") Integer DistrictId,
                    @Param("AcademicDegree") Integer AcademicDegree);

    @Modifying
    @Query(value = "{ call InsertUpdateProfessor(:Id, :Username, :Password, :IsAdministrator, :Status, :Name, :LastName, :Mail, :Image,  :ProvinceId, :CantonId, :DistrictId, :AcademicDegree ,'Update')}", nativeQuery = true)
    void UpdateProfessor(@Param("Id") Integer Id,
                      @Param("Username") String Username,
                      @Param("Password") String Password,
                      @Param("IsAdministrator") Integer IsAdministrator,
                      @Param("Status") String Status,
                      @Param("Name") String Name,
                      @Param("LastName") String LastName,
                      @Param("Mail") String Mail,
                      @Param("Image") String Image,
                      @Param("ProvinceId") Integer ProvinceId,
                      @Param("CantonId") Integer CantonId,
                      @Param("DistrictId") Integer DistrictId,
                      @Param("AcademicDegree") Integer AcademicDegree);

    @Query(value = "SelectProfessor", nativeQuery = true)
    List<SelectProfessorResult> ListAllProfessors();

    @Query(value = "{call GetProfessorById(:Id)}", nativeQuery = true)
    GetProfessorByIdResult getProfessorById(@Param("Id") Integer Id);

    @Modifying
    @Query(value = "{ call DeleteProfessor(:Id)}", nativeQuery = true)
    void DeleteProfessor(@Param("Id") Integer Id);

    @Query(value = "SelectAcademicDegree", nativeQuery = true)
    List<SelectAcademicDegreeResult> ListAcademicDegree();

    @Modifying
    @Query(value = "{ call InsertUpdateSocialNetworkStudent(:Id, :StudentId, :Url, :SocialNetworksNameId, 'Insert')}", nativeQuery = true)
    void addSocialNetwork(@Param("Id") Integer Id,
                          @Param("StudentId") Integer StudentId,
                          @Param("Url") String Url,
                          @Param("SocialNetworksNameId") Integer SocialNetworksNameId);

    @Modifying
    @Query(value = "{call InsertUpdateSocialNetworkProfessor(:Id, :ProfessorId, :Url,:SocialNetworksNameId, 'Insert')}", nativeQuery = true)
    void AddSocialNetwork(@Param("Id") Integer Id, @Param("ProfessorId") Integer ProfessorId,@Param("Url") String Url, @Param("SocialNetworksNameId") Integer SocialNetworksNameId);

    @Modifying
    @Query(value = "{call InsertProfessorCourse(:ProfessorId, :CourseId)}", nativeQuery = true)
    void AddProfessorCourse(@Param("ProfessorId") Integer ProfessorId, @Param("CourseId") Integer CourseId);


    @Query(value = "GetNameSocialNetworks", nativeQuery = true)
    List<GetNameSocialNetworksResult> ListSocialNetworksCatalog();


    @Query(value = "{call GetSocialNetworksByIdProfessor(:Id)}", nativeQuery = true)
    List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(@Param("Id") Integer Id);


    @Modifying
    @Query(value = "{call UpdateProfessorImage(:Image, :Id)}", nativeQuery = true)
    void UpdateImage(@Param("Image") String Image, @Param("Id") Integer Id);

}
