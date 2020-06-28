package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.*;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Modifying
    @Query(value = "{ call InsertUpdateStudent(:Id, :Username, :Password, :IsAdministrator, :Status, :StudentCard, :StudentName, :LastName, :Birthday, :Mail, :Image, :RegistrationStatus, :ProvinceId, :CantonId, :DistrictId, 'Insert')}", nativeQuery = true)
    void addStudent(@Param("Id") Integer Id,
                    @Param("Username") String Username,
                    @Param("Password") String Password,
                    @Param("IsAdministrator") Integer IsAdministrator,
                    @Param("Status") String Status,
                    @Param("StudentCard") String StudentCard,
                    @Param("StudentName") String StudentName,
                    @Param("LastName") String LastName,
                    @Param("Birthday") String Birthday,
                    @Param("Mail") String Mail,
                    @Param("Image") String Image,
                    @Param("RegistrationStatus") String RegistrationStatus,
                    @Param("ProvinceId") Integer ProvinceId,
                    @Param("CantonId") Integer CantonId,
                    @Param("DistrictId") Integer DistrictId);

    @Modifying
    @Query(value = "{ call InsertUpdateStudent(:Id, :Username, :Password, :IsAdministrator, :Status, :StudentCard, :StudentName, :LastName, :Birthday, :Mail, :Image, :RegistrationStatus, :ProvinceId, :CantonId, :DistrictId, 'Update')}", nativeQuery = true)
    void updateStudent(@Param("Id") Integer Id,
                    @Param("Username") String Username,
                    @Param("Password") String Password,
                    @Param("IsAdministrator") Integer IsAdministrator,
                    @Param("Status") String Status,
                    @Param("StudentCard") String StudentCard,
                    @Param("StudentName") String StudentName,
                    @Param("LastName") String LastName,
                    @Param("Birthday") String Birthday,
                    @Param("Mail") String Mail,
                    @Param("Image") String Image,
                    @Param("RegistrationStatus") String RegistrationStatus,
                    @Param("ProvinceId") Integer ProvinceId,
                    @Param("CantonId") Integer CantonId,
                    @Param("DistrictId") Integer DistrictId);

    @Query(value = "SelectStudent", nativeQuery = true)
    List<SelectStudentResult> ListAllStudents();

    @Query(value = "{call GetStudentById(:Id)}", nativeQuery = true)
    GetStudentByIdResult getStudentById(@Param("Id") Integer Id);

    @Query(value = "StudentApproval", nativeQuery = true)
    List<StudentApprovalResult> ListStudentApproval();

    @Modifying
    @Query(value = "{call UpdateStatusStudent(:Id, :RegistrationStatus)}", nativeQuery = true)
    void UpdateStudentStatus(@Param("Id") Integer Id, @Param("RegistrationStatus") String RegistrationStatus);

    @Modifying
    @Query(value = "{ call DeleteStudent(:Id)}", nativeQuery = true)
    void DeleteStudent(@Param("Id") Integer Id);

    @Query(value = "ListStudent", nativeQuery = true)
    List<ListStudentResult> ListStudents();

    @Modifying
    @Query(value = "{ call InsertUpdateSocialNetworkStudent(:Id, :StudentId, :Url, :SocialNetworksNameId, 'Insert')}", nativeQuery = true)
    void addSocialNetwork(@Param("Id") Integer Id,
                    @Param("StudentId") Integer StudentId,
                    @Param("Url") String Url,
                          @Param("SocialNetworksNameId") Integer SocialNetworksNameId);


    @Modifying
    @Query(value = "{call InsertStudentCourse(:StudentId, :CourseId)}", nativeQuery = true)
    void AddStudentCourse(@Param("StudentId") Integer StudentId, @Param("CourseId") Integer CourseId);


    @Query(value = "GetNameSocialNetworks", nativeQuery = true)
    List<GetNameSocialNetworksResult> ListSocialNetworksCatalog();


    @Query(value = "{call GetSocialNetworksByIdStudent(:Id)}", nativeQuery = true)
    List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(@Param("Id") Integer Id);


    @Modifying
    @Query(value = "{call UpdateStudentImage(:Image, :Id)}", nativeQuery = true)
    void UpdateImage(@Param("Image") String Image, @Param("Id") Integer Id);



}
