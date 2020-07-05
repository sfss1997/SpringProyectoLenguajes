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
    @Autowired
    private StudentCoursesRepository studentCoursesRepository;
    @Autowired
    private ProfessorCourseRepository professorCourseRepository;
    @Autowired
    private ProfessorCoursesRepository professorCoursesRepository;
    @Autowired
    private PublicConsultationRepository publicConsultationRepository;
    @Autowired
    private PrivateMessageRepository privateMessageRepository;
    @Autowired
    private RepliesPublicConsultationRepository repliesPublicConsultationRepository;
    @Autowired
    private RepliesPrivateMessageRepository repliesPrivateMessageRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    public void AddCourse(CourseDTO course){
        courseRepository.AddCourse(course.getId(),course.getInitials(),course.getName(),course.getIsActive(),course.getCredits(),course.getCycle());}


    public void UpdateCourse(CourseDTO course){
        courseRepository.UpdateCourse(course.getId(),course.getInitials(),course.getName(),course.getIsActive(),course.getCredits(),course.getCycle());}


    public Course getCourseById(Integer Id){return courseRepository.getCourseById(Id);}


    public List<Course> ListAllCourses(){return courseRepository.ListAllCourses();}


    public void DeleteCourse(Integer Id){
        courseRepository.DeleteCourse(Id);}


    public List<GetStudentCoursesResult> GetStudentCourses(Integer Id){return studentCoursesRepository.GetStudentCourses(Id);}


    public List<GetProfessorCoursesResult> GetProfessorCourses(Integer Id){return professorCoursesRepository.GetProfessorCourses(Id);}


    public GetProfessorByIdCourseResult GetProfessorByIdCourse(Integer Id){return professorCourseRepository.GetProfessorByIdCourse(Id);}


    public void AddPublicConsultation(PublicConsultationDTO PublicConsultation){  courseRepository.AddPublicConsultation(PublicConsultation.getCourseId(),PublicConsultation.getStudentId(),PublicConsultation.getProfessorId(),PublicConsultation.getMotive(),PublicConsultation.getDateTime());}


    public void AddPrivateMessage(PrivateMessageDTO PrivateMessage ){
        courseRepository.AddPrivateMessage(PrivateMessage.getCourseId(),PrivateMessage.getStudentId(),PrivateMessage.getProfessorId(),PrivateMessage.getMotive(), PrivateMessage.getDateTime());}


    public List<GetPublicConsultationResult> GetPublicConsultation(GetPublicConsultationDTO PublicConsultation){return publicConsultationRepository.GetPublicConsultation(PublicConsultation.getCourseId(), PublicConsultation.getProfessorId());}


    public List<GetPrivateMessageResult> GetPrivateMessage(GetPrivateMessageDTO PrivateMessage){return privateMessageRepository.GetPrivateMessage(PrivateMessage.getCourseId(),PrivateMessage.getProfessorId());}


    public void AddRepliesPublicConsultation(AddRepliesPublicConsultationDTO Replies){
        courseRepository.AddRepliesPublicConsultation(Replies.getPublicConsultationId(),Replies.getStudentId(),Replies.getProfessorId(),Replies.getMotive(),Replies.getDateTime());}


    public List<GetRepliesPublicConsultationResult> GetRepliesPublicConsultation(Integer PublicConsultationId){return repliesPublicConsultationRepository.GetRepliesPublicConsultation(PublicConsultationId);}



    public void AddRepliesPrivateMessage(AddRepliesPrivateMessageDTO Replies){
        courseRepository.AddRepliesPrivateMessage(Replies.getPrivateMessageId(),Replies.getStudentId(),Replies.getProfessorId(),Replies.getMotive(),Replies.getDateTime());}

    public List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(Integer Id){return repliesPrivateMessageRepository.GetRepliesPrivateMessage(Id);}


    public void AddAppointment(AppointmentDTO Appointment){
        courseRepository.AddAppointment(Appointment.getCourseId(),Appointment.getStudentId(),Appointment.getProfessorId(),Appointment.getMotive(),Appointment.getAccepted(),Appointment.getDateTime());}


    public void UpdateStatusAppointment(StatusAppointmentDTO Status){ courseRepository.UpdateStatusAppointment(Status.getAppointmentId(),Status.getAccepted());}


    public List<GetAppointmentResult> GetAppointment(GetAppointmentDTO Appointment){return appointmentRepository.GetAppointment(Appointment.getStudentId(),Appointment.getProfessorId(),Appointment.getCourseId());}


    public List<GetAppointmentResult> GetAppointmentById(Integer Id){return appointmentRepository.GetAppointmentById(Id);}


    public List<GetAppointmentResult> GetAppointmentProfessor(GetAppointmentProfessorDTO AppointmentProfessor){return appointmentRepository.GetAppointmentProfessor(AppointmentProfessor.getProfessorId(),AppointmentProfessor.getCourseId());}
}
