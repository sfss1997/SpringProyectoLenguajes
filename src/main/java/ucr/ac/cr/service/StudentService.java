package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.mail.MailClient;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.*;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    MailClient mailClient;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AllStudentsRepository allStudentRepository;
    @Autowired
    private StudentByIdRepository studentByIdRepository;
    @Autowired
    private StudentApprovalRepository studentApprovalRepository;
    @Autowired
    private ListStudentsRepository listStudentsRepository;
    @Autowired
    private SocialNetworkCatalogRepository socialNetworkCatalogRepository;
    @Autowired
    private SocialNetworksStudentRepository socialNetworksStudentRepository;

    public void AddStudent(StudentDTO student){

        Email email = new Email();
        email.setBody(student.getStudentName() + " " + student.getLastName() + ", ha sido añadido satisfactoriamente, su aprobación se encuentra en espera. ");
        email.setSubject("Nuevo Usuario");
        email.setTo(student.getMail());
        //mailClient.SendEmail(email);
        studentRepository.addStudent(student.getId(),student.getUsername(),student.getPassword(),student.getIsAdministrator(),student.getStatus(),student.getStudentCard(),student.getStudentName(),student.getLastName(), student.getBirthday(),student.getMail(),student.getImage(),student.getRegistrationStatus(), student.getProvinceId(),student.getCantonId(),student.getDistrictId());
    }

    public void UpdateStudent(StudentDTO student){ studentRepository.updateStudent(student.getId(),student.getUsername(),student.getPassword(),student.getIsAdministrator(),student.getStatus(),student.getStudentCard(),student.getStudentName(),student.getLastName(), student.getBirthday(),student.getMail(),student.getImage(),student.getRegistrationStatus(), student.getProvinceId(),student.getCantonId(),student.getDistrictId());}

    public List<SelectStudentResult> ListAllStudents() {
        return allStudentRepository.ListAllStudents();
    }

    public GetStudentByIdResult getStudentById(int Id) { return studentByIdRepository.getStudentById(Id); }

    public List<StudentApprovalResult> ListStudentApproval() { return studentApprovalRepository.ListStudentApproval(); }

    public void StudentApproval(GetStudentByIdResult student){


        Email email = new Email();
        email.setBody("El estudiante " + student.getStudentName() + " " + student.getLastName() + ", ha sido aprobado.");
        email.setSubject("Actualización de estado");
        email.setTo(student.getMail());
        //mailClient.SendEmail(email);
        studentRepository.UpdateStudentStatus(student.getId(),"Aprobado");
    }

    public void StudentDeny(GetStudentByIdResult student){



        Email email = new Email();
        email.setBody("El estudiante " + student.getStudentName() + " " + student.getLastName() + ", ha sido rechazado.");
        email.setSubject("Actualización de estado");
        email.setTo(student.getMail());
        //mailClient.SendEmail(email);
        studentRepository.UpdateStudentStatus(student.getId(),"Rechazado");
    }

    public void DeleteStudent(int Id){ studentRepository.DeleteStudent(Id);}

    public List<ListStudentResult> ListStudents() { return listStudentsRepository.ListStudents(); }

    public void addSocialNetwork(SocialNetworkDTO SocialNetwork)
    {
        studentRepository.addSocialNetwork(SocialNetwork.getId(),SocialNetwork.getUserId(),SocialNetwork.getUrl(),SocialNetwork.getSocialNetworksNameId());}

    public void AddStudentCourse(UserCourseDTO StudentCourse) {
        studentRepository.AddStudentCourse(StudentCourse.getUserId(),StudentCourse.getCourseId());}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog() {return socialNetworkCatalogRepository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(int Id) {return socialNetworksStudentRepository.GetSocialNetworksByIdStudent(Id);}

    public void UpdateImage(ImageDTO Image){ studentRepository.UpdateImage(Image.getImage(),Image.getId());}



}
