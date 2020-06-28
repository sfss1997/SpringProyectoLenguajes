package ucr.ac.cr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.CourseRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public void AddCourse(CourseDAO course){repository.AddCourse(course.getId(),course.getInitials(),course.getName(),course.getIsActive(),course.getCredits(),course.getCycle());}


    public void UpdateCourse(CourseDAO course){repository.UpdateCourse(course.getId(),course.getInitials(),course.getName(),course.getIsActive(),course.getCredits(),course.getCycle());}


    public Course getCourseById(Integer Id){return repository.getCourseById(Id);}


    public List<Course> ListAllCourses(){return repository.ListAllCourses();}


    public void DeleteCourse(Integer Id){repository.DeleteCourse(Id);}


    public List<GetStudentCoursesResult> GetStudentCourses(Integer Id){return repository.GetStudentCourses(Id);}


    public List<GetProfessorCoursesResult> GetProfessorCourses(Integer Id){return repository.GetProfessorCourses(Id);}


    public GetProfessorByIdCourseResult GetProfessorByIdCourse(Integer Id){return repository.GetProfessorByIdCourse(Id);}


    public void AddPublicConsultation(PublicConsultationDAO PublicConsultation){  repository.AddPublicConsultation(PublicConsultation.getCourseId(),PublicConsultation.getStudentId(),PublicConsultation.getProfessorId(),PublicConsultation.getMotive(),PublicConsultation.getDateTime());}


    public void AddPrivateMessage(PrivateMessageDAO PrivateMessage ){repository.AddPrivateMessage(PrivateMessage.getCourseId(),PrivateMessage.getStudentId(),PrivateMessage.getProfessorId(),PrivateMessage.getMotive(), PrivateMessage.getDateTime());}


    public List<GetPublicConsultationResult> GetPublicConsultation(GetPublicConsultationDAO PublicConsultation){return repository.GetPublicConsultation(PublicConsultation.getCourseId(), PublicConsultation.getProfessorId());}


    public List<GetPrivateMessageResult> GetPrivateMessage(GetPrivateMessageDAO PrivateMessage){return repository.GetPrivateMessage(PrivateMessage.getCourseId(),PrivateMessage.getProfessorId());}


    public void AddRepliesPublicConsultation(AddRepliesPublicConsultationDAO Replies){repository.AddRepliesPublicConsultation(Replies.getPublicConsultationId(),Replies.getStudentId(),Replies.getProfessorId(),Replies.getMotive(),Replies.getDateTime());}


    public List<GetRepliesPublicConsultation> GetRepliesPublicConsultation(Integer PublicConsultationId){return repository.GetRepliesPublicConsultation(PublicConsultationId);}



    public void AddRepliesPrivateMessage(AddRepliesPrivateMessageDAO Replies){repository.AddRepliesPrivateMessage(Replies.getPrivateMessageId(),Replies.getStudentId(),Replies.getProfessorId(),Replies.getMotive(),Replies.getDateTime());}

    public List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(Integer Id){return repository.GetRepliesPrivateMessage(Id);}


    public void AddAppointment(AppointmentDAO Appointment){repository.AddAppointment(Appointment.getCourseId(),Appointment.getStudentId(),Appointment.getProfessorId(),Appointment.getMotive(),Appointment.getAccepted(),Appointment.getDateTime());}


    public void UpdateStatusAppointment(StatusAppointmentDAO Status){ repository.UpdateStatusAppointment(Status.getAppointmentId(),Status.getAccepted());}


    public List<GetAppointmentResult> GetAppointment(GetAppointmentDAO Appointment){return repository.GetAppointment(Appointment.getStudentId(),Appointment.getProfessorId(),Appointment.getPublicConsultationId());}


    public List<GetAppointmentResult> GetAppointmentById(Integer Id){return repository.GetAppointmentById(Id);}


    public List<GetAppointmentResult> GetAppointmentProfessor(GetAppointmentProfessorDAO AppointmentProfessor){return repository.GetAppointmentProfessor(AppointmentProfessor.getProfessorId(),AppointmentProfessor.getPublicConsultationId());}
}
