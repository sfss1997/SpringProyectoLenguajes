package ucr.ac.cr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.*;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    private ProfessorCourseRepository professorCourseRepository;
    private ProfessorCoursesRepository professorCoursesRepository;
    private PublicConsultationRepository publicConsultationRepository;
    private PrivateMessageRepository privateMessageRepository;
    private RepliesPublicConsultationRepository repliesPublicConsultationRepository;
    private RepliesPrivateMessageRepository repliesPrivateMessageRepository;
    private AppointmentRepository appointmentRepository;

    public void AddCourse(CourseDAO course){
        courseRepository.AddCourse(course.getId(),course.getInitials(),course.getName(),course.getIsActive(),course.getCredits(),course.getCycle());}


    public void UpdateCourse(CourseDAO course){
        courseRepository.UpdateCourse(course.getId(),course.getInitials(),course.getName(),course.getIsActive(),course.getCredits(),course.getCycle());}


    public Course getCourseById(Integer Id){return courseRepository.getCourseById(Id);}


    public List<Course> ListAllCourses(){return courseRepository.ListAllCourses();}


    public void DeleteCourse(Integer Id){
        courseRepository.DeleteCourse(Id);}


    public List<GetStudentCoursesResult> GetStudentCourses(Integer Id){return courseRepository.GetStudentCourses(Id);}


    public List<GetProfessorCoursesResult> GetProfessorCourses(Integer Id){return professorCoursesRepository.GetProfessorCourses(Id);}


    public GetProfessorByIdCourseResult GetProfessorByIdCourse(Integer Id){return professorCourseRepository.GetProfessorByIdCourse(Id);}


    public void AddPublicConsultation(PublicConsultationDAO PublicConsultation){  courseRepository.AddPublicConsultation(PublicConsultation.getCourseId(),PublicConsultation.getStudentId(),PublicConsultation.getProfessorId(),PublicConsultation.getMotive(),PublicConsultation.getDateTime());}


    public void AddPrivateMessage(PrivateMessageDAO PrivateMessage ){
        courseRepository.AddPrivateMessage(PrivateMessage.getCourseId(),PrivateMessage.getStudentId(),PrivateMessage.getProfessorId(),PrivateMessage.getMotive(), PrivateMessage.getDateTime());}


    public List<GetPublicConsultationResult> GetPublicConsultation(GetPublicConsultationDAO PublicConsultation){return publicConsultationRepository.GetPublicConsultation(PublicConsultation.getCourseId(), PublicConsultation.getProfessorId());}


    public List<GetPrivateMessageResult> GetPrivateMessage(GetPrivateMessageDAO PrivateMessage){return privateMessageRepository.GetPrivateMessage(PrivateMessage.getCourseId(),PrivateMessage.getProfessorId());}


    public void AddRepliesPublicConsultation(AddRepliesPublicConsultationDAO Replies){
        courseRepository.AddRepliesPublicConsultation(Replies.getPublicConsultationId(),Replies.getStudentId(),Replies.getProfessorId(),Replies.getMotive(),Replies.getDateTime());}


    public List<GetRepliesPublicConsultation> GetRepliesPublicConsultation(Integer PublicConsultationId){return repliesPublicConsultationRepository.GetRepliesPublicConsultation(PublicConsultationId);}



    public void AddRepliesPrivateMessage(AddRepliesPrivateMessageDAO Replies){
        courseRepository.AddRepliesPrivateMessage(Replies.getPrivateMessageId(),Replies.getStudentId(),Replies.getProfessorId(),Replies.getMotive(),Replies.getDateTime());}

    public List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(Integer Id){return repliesPrivateMessageRepository.GetRepliesPrivateMessage(Id);}


    public void AddAppointment(AppointmentDAO Appointment){
        courseRepository.AddAppointment(Appointment.getCourseId(),Appointment.getStudentId(),Appointment.getProfessorId(),Appointment.getMotive(),Appointment.getAccepted(),Appointment.getDateTime());}


    public void UpdateStatusAppointment(StatusAppointmentDAO Status){ courseRepository.UpdateStatusAppointment(Status.getAppointmentId(),Status.getAccepted());}


    public List<GetAppointmentResult> GetAppointment(GetAppointmentDAO Appointment){return appointmentRepository.GetAppointment(Appointment.getStudentId(),Appointment.getProfessorId(),Appointment.getPublicConsultationId());}


    public List<GetAppointmentResult> GetAppointmentById(Integer Id){return appointmentRepository.GetAppointmentById(Id);}


    public List<GetAppointmentResult> GetAppointmentProfessor(GetAppointmentProfessorDAO AppointmentProfessor){return appointmentRepository.GetAppointmentProfessor(AppointmentProfessor.getProfessorId(),AppointmentProfessor.getPublicConsultationId());}
}
