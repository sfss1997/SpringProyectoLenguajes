package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.CourseService;
import ucr.ac.cr.service.ProfessorService;


import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

    @Autowired
    private CourseService service;

    //YAAA
    @GetMapping("/Course/Add")
    public void AddCourse(@RequestBody CourseDAO course){service.AddCourse(course);}

    //YAAA
    @GetMapping("/Course/Update")
    public void UpdateCourse(@RequestBody CourseDAO course){service.UpdateCourse(course);}

    //YAAA
    @GetMapping("/Course/DeleteCourse")
    public void DeleteCourse(@RequestParam(value = "id")Integer Id){service.DeleteCourse(Id);}

    //YAAA
    @GetMapping("/Course/AddPublicConsultation")
    public void AddPublicConsultation(@RequestBody PublicConsultationDAO PublicConsultation){  service.AddPublicConsultation(PublicConsultation);}

    //YAAA
    @GetMapping("/Course/AddPrivateMessage")
    public void AddPrivateMessage(@RequestBody PrivateMessageDAO PrivateMessage ){service.AddPrivateMessage(PrivateMessage );}

    //YAAA
    @GetMapping("/Course/AddRepliesPublicConsultation")
    public void AddRepliesPublicConsultation(@RequestBody AddRepliesPublicConsultationDAO Replies){service.AddRepliesPublicConsultation(Replies);}

    //YAAA
    @GetMapping("/Course/AddRepliesPrivateMessage")
    public void AddRepliesPrivateMessage(@RequestBody AddRepliesPrivateMessageDAO Replies){service.AddRepliesPrivateMessage(Replies);}

    //YAAA
    @GetMapping("/Course/AddAppointment")
    public void AddAppointment(@RequestBody AppointmentDAO Appointment){service.AddAppointment(Appointment);}

    //YAAA
    @GetMapping("/Course/UpdateStatusAppointment")
    public void UpdateStatusAppointment(@RequestBody StatusAppointmentDAO Status){ service.UpdateStatusAppointment(Status);}








    @GetMapping("/Course/GetCourseById")
    public Course GetCourseById(@RequestParam(value = "id")Integer Id){return service.getCourseById(Id);}

    @GetMapping("/Course/ListAllCourses")
    public List<Course> ListAllCourses(){return service.ListAllCourses();}


    @GetMapping("/Course/GetStudentCourses")
    public List<GetStudentCoursesResult> GetStudentCourses(@RequestParam(value = "id")Integer Id){return service.GetStudentCourses(Id);}

    @GetMapping("/Course/GetProfessorCourses")
    public List<GetProfessorCoursesResult> GetProfessorCourses(@RequestParam(value = "id")Integer Id){return service.GetProfessorCourses(Id);}

    @GetMapping("/Course/GetProfessorByIdCourse")
    public GetProfessorByIdCourseResult GetProfessorByIdCourse(@RequestParam(value = "id")Integer Id){return service.GetProfessorByIdCourse(Id);}


    @GetMapping("/Course/GetPublicConsultation")
    public List<GetPublicConsultationResult> GetPublicConsultation(@RequestBody GetPublicConsultationDAO PublicConsultation){return service.GetPublicConsultation(PublicConsultation);}

    @GetMapping("/Course/GetPrivateMessage")
    public List<GetPrivateMessageResult> GetPrivateMessage(@RequestBody GetPrivateMessageDAO PrivateMessage){return service.GetPrivateMessage(PrivateMessage);}


    @GetMapping("/Course/GetRepliesPublicConsultation")
    public List<GetRepliesPublicConsultation> GetRepliesPublicConsultation(@RequestParam(value = "id")Integer PublicConsultationId){return service.GetRepliesPublicConsultation(PublicConsultationId);}


    @GetMapping("/Course/GetRepliesPrivateMessage")
    public List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(@RequestParam(value = "id")Integer Id){return service.GetRepliesPrivateMessage(Id);}


    @GetMapping("/Course/GetAppointment")
    public List<GetAppointmentResult> GetAppointment(@RequestBody GetAppointmentDAO Appointment){return service.GetAppointment(Appointment);}

    @GetMapping("/Course/GetAppointmentById")
    public List<GetAppointmentResult> GetAppointmentById(@RequestParam(value = "id")Integer Id){return service.GetAppointmentById(Id);}

    @GetMapping("/Course/GetAppointmentProfessor")
    public List<GetAppointmentResult> GetAppointmentProfessor(@RequestBody GetAppointmentProfessorDAO AppointmentProfessor){return service.GetAppointmentProfessor(AppointmentProfessor);}


}
