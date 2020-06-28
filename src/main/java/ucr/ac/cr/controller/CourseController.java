package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.CourseService;
import ucr.ac.cr.service.ProfessorService;


import java.util.List;


@RestController
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/Course/Add")
    public void AddCourse(@RequestBody CourseDAO course){service.AddCourse(course);}

    @PutMapping("/Course/Update")
    public void UpdateCourse(@RequestBody CourseDAO course){service.UpdateCourse(course);}

    @DeleteMapping("/Course/DeleteCourse")
    public void DeleteCourse(@RequestParam(value = "id")Integer Id){service.DeleteCourse(Id);}

    @PostMapping("/Course/AddPublicConsultation")
    public void AddPublicConsultation(@RequestBody PublicConsultationDAO PublicConsultation){  service.AddPublicConsultation(PublicConsultation);}

    @PostMapping("/Course/AddPrivateMessage")
    public void AddPrivateMessage(@RequestBody PrivateMessageDAO PrivateMessage ){service.AddPrivateMessage(PrivateMessage );}

    @PostMapping("/Course/AddRepliesPublicConsultation")
    public void AddRepliesPublicConsultation(@RequestBody AddRepliesPublicConsultationDAO Replies){service.AddRepliesPublicConsultation(Replies);}

    @PostMapping("/Course/AddRepliesPrivateMessage")
    public void AddRepliesPrivateMessage(@RequestBody AddRepliesPrivateMessageDAO Replies){service.AddRepliesPrivateMessage(Replies);}

    @PostMapping("/Course/AddAppointment")
    public void AddAppointment(@RequestBody AppointmentDAO Appointment){service.AddAppointment(Appointment);}

    @PutMapping("/Course/UpdateStatusAppointment")
    public void UpdateStatusAppointment(@RequestBody StatusAppointmentDAO Status){ service.UpdateStatusAppointment(Status);}

    @GetMapping("/Course/GetCourseById")
    public Course GetCourseById(@RequestParam(value = "id")Integer Id){return service.getCourseById(Id);}

    @GetMapping("/Course/ListAllCourses")
    public List<Course> ListAllCourses(){return service.ListAllCourses();}

    @GetMapping("/Course/GetStudentCourses")
    public List<GetStudentCoursesResult> GetStudentCourses(@RequestParam(value = "id")Integer Id){return service.GetStudentCourses(Id);}

    @GetMapping("/Course/GetProfessorCourses")
    public List<GetProfessorCoursesResult> GetProfessorCourses(@RequestParam(value = "id")Integer Id){return service.GetProfessorCourses(Id);}

    //falta este
    @GetMapping("/Course/GetProfessorByIdCourse")
    public GetProfessorByIdCourseResult GetProfessorByIdCourse(@RequestParam(value = "id")Integer Id){return service.GetProfessorByIdCourse(Id);}

    //falta este
    @GetMapping("/Course/GetPublicConsultation")
    public List<GetPublicConsultationResult> GetPublicConsultation(@RequestBody GetPublicConsultationDAO PublicConsultation){return service.GetPublicConsultation(PublicConsultation);}

    //falta este
    @GetMapping("/Course/GetPrivateMessage")
    public List<GetPrivateMessageResult> GetPrivateMessage(@RequestBody GetPrivateMessageDAO PrivateMessage){return service.GetPrivateMessage(PrivateMessage);}

    //falta este
    @GetMapping("/Course/GetRepliesPublicConsultation")
    public List<GetRepliesPublicConsultation> GetRepliesPublicConsultation(@RequestParam(value = "id")Integer PublicConsultationId){return service.GetRepliesPublicConsultation(PublicConsultationId);}

    //falta este
    @GetMapping("/Course/GetRepliesPrivateMessage")
    public List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(@RequestParam(value = "id")Integer Id){return service.GetRepliesPrivateMessage(Id);}

    //falta este
    @GetMapping("/Course/GetAppointment")
    public List<GetAppointmentResult> GetAppointment(@RequestBody GetAppointmentDAO Appointment){return service.GetAppointment(Appointment);}

    //falta este
    @GetMapping("/Course/GetAppointmentById")
    public List<GetAppointmentResult> GetAppointmentById(@RequestParam(value = "id")Integer Id){return service.GetAppointmentById(Id);}

    //falta este
    @GetMapping("/Course/GetAppointmentProfessor")
    public List<GetAppointmentResult> GetAppointmentProfessor(@RequestBody GetAppointmentProfessorDAO AppointmentProfessor){return service.GetAppointmentProfessor(AppointmentProfessor);}


}
