package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.GetAppointmentResult;
import ucr.ac.cr.project.Location;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<GetAppointmentResult, Integer> {
    @Query(value = "{call GetAppointment(:StudentId, :ProfessorId, :CourseId)}", nativeQuery = true)
    List<GetAppointmentResult> GetAppointment(@Param("StudentId") Integer StudentId,
                                              @Param("ProfessorId") Integer ProfessorId,
                                              @Param("CourseId") Integer PublicConsultationId);

    @Query(value = "{call GetAppointmentById(:Id)}", nativeQuery = true)
    List<GetAppointmentResult> GetAppointmentById(@Param("Id") Integer Id);

    @Query(value = "{call GetAppointment( :ProfessorId, :CourseId)}", nativeQuery = true)
    List<GetAppointmentResult> GetAppointmentProfessor(@Param("ProfessorId") Integer ProfessorId,
                                                       @Param("CourseId") Integer CourseId);
}
