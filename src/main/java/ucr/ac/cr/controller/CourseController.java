package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.CourseService;


import java.util.List;


@RestController
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/Course/Add")
    public void AddCourse(@RequestBody CourseDTO course){service.AddCourse(course);}

    @PutMapping("/Course/Update")
    public void UpdateCourse(@RequestBody CourseDTO course){service.UpdateCourse(course);}

    @DeleteMapping("/Course/DeleteCourse")
    public void DeleteCourse(@RequestParam(value = "id")Integer Id){service.DeleteCourse(Id);}

    @PostMapping("/Course/AddPublicConsultation")
    public void AddPublicConsultation(@RequestBody PublicConsultationDTO PublicConsultation){  service.AddPublicConsultation(PublicConsultation);}

    @PostMapping("/Course/AddPrivateMessage")
    public void AddPrivateMessage(@RequestBody PrivateMessageDTO PrivateMessage ){service.AddPrivateMessage(PrivateMessage );}

    @PostMapping("/Course/AddRepliesPublicConsultation")
    public void AddRepliesPublicConsultation(@RequestBody AddRepliesPublicConsultationDTO Replies){service.AddRepliesPublicConsultation(Replies);}

    @PostMapping("/Course/AddRepliesPrivateMessage")
    public void AddRepliesPrivateMessage(@RequestBody AddRepliesPrivateMessageDTO Replies){service.AddRepliesPrivateMessage(Replies);}

    @PostMapping("/Course/AddAppointment")
    public void AddAppointment(@RequestBody AppointmentDTO Appointment){service.AddAppointment(Appointment);}

    @PutMapping("/Course/UpdateStatusAppointment")
    public void UpdateStatusAppointment(@RequestBody StatusAppointmentDTO Status){ service.UpdateStatusAppointment(Status);}

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
    public List<GetPublicConsultationResult> GetPublicConsultation(@RequestParam(value = "courseId") Integer courseId, @RequestParam(value = "professorId") Integer professorId){
        GetPublicConsultationDTO getPublicConsultationDTO = new GetPublicConsultationDTO();
        getPublicConsultationDTO.setCourseId(courseId);
        getPublicConsultationDTO.setProfessorId(professorId);
        return service.GetPublicConsultation(getPublicConsultationDTO);
    }

    @GetMapping("/Course/GetPrivateMessage")
    public List<GetPrivateMessageResult> GetPrivateMessage(@RequestParam(value = "courseId") Integer courseId, @RequestParam(value = "professorId") Integer professorId){
        GetPrivateMessageDTO getPrivateMessageDTO = new GetPrivateMessageDTO();
        getPrivateMessageDTO.setCourseId(courseId);
        getPrivateMessageDTO.setProfessorId(professorId);
        return service.GetPrivateMessage(getPrivateMessageDTO);
    }

    @GetMapping("/Course/GetRepliesPublicConsultation")
    public List<GetRepliesPublicConsultationResult> GetRepliesPublicConsultation(@RequestParam(value = "id")Integer PublicConsultationId){return service.GetRepliesPublicConsultation(PublicConsultationId);}

    @GetMapping("/Course/GetRepliesPrivateMessage")
    public List<GetRepliesPrivateMessageResult> GetRepliesPrivateMessage(@RequestParam(value = "id")Integer Id){return service.GetRepliesPrivateMessage(Id);}

    @GetMapping("/Course/GetAppointment")
    public List<GetAppointmentResult> GetAppointment(@RequestParam(value = "studentId") Integer studentId, @RequestParam(value = "courseId") Integer courseId, @RequestParam(value = "professorId") Integer professorId){
        GetAppointmentDTO getAppointmentDTO = new GetAppointmentDTO();
        getAppointmentDTO.setStudentId(studentId);
        getAppointmentDTO.setCourseId(courseId);
        getAppointmentDTO.setProfessorId(professorId);
        return service.GetAppointment(getAppointmentDTO);
    }

    @GetMapping("/Course/GetAppointmentById")
    public List<GetAppointmentResult> GetAppointmentById(@RequestParam(value = "id")Integer Id){return service.GetAppointmentById(Id);}

    @GetMapping("/Course/GetAppointmentProfessor")
    public List<GetAppointmentResult> GetAppointmentProfessor(@RequestParam(value = "courseId") Integer courseId, @RequestParam(value = "professorId") Integer professorId){
        GetAppointmentProfessorDTO getAppointmentProfessorDTO = new GetAppointmentProfessorDTO();
        getAppointmentProfessorDTO.setCourseId(courseId);
        getAppointmentProfessorDTO.setProfessorId(professorId);
        return service.GetAppointmentProfessor(getAppointmentProfessorDTO);
    }


}
