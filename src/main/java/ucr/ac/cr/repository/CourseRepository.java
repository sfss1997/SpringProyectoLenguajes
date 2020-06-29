package ucr.ac.cr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.*;

import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Modifying
    @Query(value = "{call InsertUpdateCourse(:Id,:Initials,:Name, :IsActive, :Credits, :Cycle, 'Insert')}", nativeQuery = true)
    void AddCourse(@Param("Id") Integer Id,
                   @Param("Initials") String Initials,
                   @Param("Name") String Name,
                   @Param("IsActive") Integer IsActive,
                   @Param("Credits") Integer Credits,
                   @Param("Cycle") Integer Cycle);


    @Modifying
    @Query(value = "{call InsertUpdateCourse(:Id,:Initials,:Name, :IsActive, :Credits, :Cycle, 'Update')}", nativeQuery = true)
    void UpdateCourse(@Param("Id") Integer Id,
                   @Param("Initials") String Initials,
                   @Param("Name") String Name,
                   @Param("IsActive") Integer IsActive,
                   @Param("Credits") Integer Credits,
                   @Param("Cycle") Integer Cycle);


    @Query(value = "{call GetCourseById(:Id)}", nativeQuery = true)
    Course getCourseById(@Param("Id") Integer Id);


    @Query(value = "SelectCourse", nativeQuery = true)
    List<Course> ListAllCourses();


    @Modifying
    @Query(value = "{ call DeleteCourse(:Id)}", nativeQuery = true)
    void DeleteCourse(@Param("Id") Integer Id);


    @Query(value = "{call GetStudentCourses(:Id)}", nativeQuery = true)
    List<GetStudentCoursesResult> GetStudentCourses(@Param("Id") Integer Id);


    @Query(value = "{call GetProfessorCourses(:Id)}", nativeQuery = true)
    List<GetProfessorCoursesResult> GetProfessorCourses(@Param("Id") Integer Id);


    @Query(value = "{call GetProfessorByIdCourse(:Id)}", nativeQuery = true)
    GetProfessorByIdCourseResult GetProfessorByIdCourse(@Param("Id") Integer Id);

    @Modifying
    @Query(value = "{call InsertPublicConsultation(:CourseId,:StudentId,:ProfessorId, :Motive, :DateTime)}", nativeQuery = true)
    void AddPublicConsultation(@Param("CourseId") Integer CourseId,
                      @Param("StudentId") Integer StudentId,
                      @Param("ProfessorId") Integer ProfessorId,
                      @Param("Motive") String Motive,
                      @Param("DateTime") String DateTime);




    @Modifying
    @Query(value = "{call InsertPrivateMessage(:CourseId,:StudentId,:ProfessorId, :Motive, :DateTime)}", nativeQuery = true)
    void AddPrivateMessage(@Param("CourseId") Integer CourseId,
                      @Param("StudentId") Integer StudentId,
                      @Param("ProfessorId") Integer ProfessorId,
                      @Param("Motive") String Motive,
                      @Param("DateTime") String DateTime);


    @Query(value = "{call GetPublicConsultation(:CourseId, :ProfessorId)}", nativeQuery = true)
    List<GetPublicConsultationResult> GetPublicConsultation(@Param("CourseId") Integer CourseId,
                                                            @Param("ProfessorId") Integer ProfessorId);


    @Query(value = "{call GetPrivateMessage(:CourseId, :ProfessorId)}", nativeQuery = true)
    List<GetPrivateMessageResult> GetPrivateMessage(@Param("CourseId") Integer CourseId,
                                                    @Param("ProfessorId") Integer ProfessorId);


    @Modifying
    @Query(value = "{call InsertRepliesPublicConsultation(:PublicConsultationId,:StudentId,:ProfessorId, :Motive, :DateTime)}", nativeQuery = true)
    void AddRepliesPublicConsultation(@Param("PublicConsultationId") Integer PublicConsultationId,
                           @Param("StudentId") Integer StudentId,
                           @Param("ProfessorId") Integer ProfessorId,
                           @Param("Motive") String Motive,
                           @Param("DateTime") String DateTime);


    @Query(value = "{call GetRepliesPublicConsultation(:PublicConsultationId)}", nativeQuery = true)
    List<GetRepliesPublicConsultationResult> GetRepliesPublicConsultation(@Param("PublicConsultationId") Integer PublicConsultationId);



    @Modifying
    @Query(value = "{call InsertRepliesPrivateMessage(:PrivateMessageId,:StudentId,:ProfessorId, :Motive, :DateTime)}", nativeQuery = true)
    void AddRepliesPrivateMessage(@Param("PrivateMessageId") Integer PublicConsultationId,
                                  @Param("StudentId") Integer StudentId,
                                  @Param("ProfessorId") Integer ProfessorId,
                                  @Param("Motive") String Motive,
                                  @Param("DateTime") String DateTime);

    @Query(value = "{call GetRepliesPrivateMessage(:PrivateMessageId)}", nativeQuery = true)
    List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(@Param("PrivateMessageId") Integer PublicConsultationId);


    @Modifying
    @Query(value = "{call InsertAppointment(:CourseId,:StudentId,:ProfessorId, :Motive, :Accepted, :DateTime)}", nativeQuery = true)
    void AddAppointment(@Param("CourseId") Integer PublicConsultationId,
                                  @Param("StudentId") Integer StudentId,
                                  @Param("ProfessorId") Integer ProfessorId,
                                  @Param("Motive") String Motive,
                                  @Param("Accepted") Integer Accepted,
                                  @Param("DateTime") String DateTime);


    @Modifying
    @Query(value = "{call StatusAppointment(:AppointmentId, :Accepted)}", nativeQuery = true)
    void UpdateStatusAppointment(@Param("AppointmentId") Integer AppointmentId,
                                 @Param("Accepted") Integer Accepted);


    @Query(value = "{call GetAppointment(:StudentId, :ProfessorId, :CourseId)}", nativeQuery = true)
    List<GetAppointmentResult> GetAppointment(@Param("StudentId") Integer StudentId,
                                              @Param("ProfessorId") Integer ProfessorId,
                                              @Param("CourseId") Integer CourseId);


    @Query(value = "{call GetAppointmentById(:Id)}", nativeQuery = true)
    List<GetAppointmentResult> GetAppointmentById(@Param("Id") Integer Id);


    @Query(value = "{call GetAppointmentProfessor( :ProfessorId, :CourseId)}", nativeQuery = true)
    List<GetAppointmentResult> GetAppointmentProfessor(@Param("ProfessorId") Integer ProfessorId,
                                              @Param("CourseId") Integer CourseId);
}
