package ucr.ac.cr.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.ProfessorService;


import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping("/AddProfessor")
    public void AddProfessor(int Id,String Username,String Password,int IsAdministrator,String Status,
                             String Name,String LastName, String Mail,String Image,int ProvinceId,int CantonId,
                             int DistrictId,int AcademicDegree){service.AddProfessor(Id,Username,Password,IsAdministrator,Status,Name,LastName,Mail,Image,ProvinceId,CantonId,DistrictId,AcademicDegree);}

    @GetMapping("/UpdateProfessor")
    public void UpdateProfessor(int Id,String Username,String Password,int IsAdministrator,String Status,
                                String Name,String LastName, String Mail,String Image,int ProvinceId,int CantonId,
                                int DistrictId,int AcademicDegree){service.UpdateProfessor(Id,Username,Password,IsAdministrator,Status,Name,LastName,Mail,Image,ProvinceId,CantonId,DistrictId,AcademicDegree);}

    @GetMapping("/ListAllProfessors")
    public List<SelectProfessorResult> ListAllProfessors(){return service.ListAllProfessors();}

    @GetMapping("/getProfessorById")
    public GetProfessorByIdResult getProfessorById(@RequestParam(value = "id") Integer Id){return service.getProfessorById(Id);}

    @GetMapping("/DeleteProfessor")
    public void DeleteProfessor(@RequestParam(value = "id") Integer Id){service.DeleteProfessor(Id);}

    @GetMapping("/ListAcademicDegree")
    public List<SelectAcademicDegreeResult> ListAcademicDegree(){return  service.ListAcademicDegree();}

    @GetMapping("/addSocialNetwork")
    public void addSocialNetwork(int Id, int StudentId,String Url,int SocialNetworksNameId){service.addSocialNetwork(Id,StudentId,Url,SocialNetworksNameId);}

    @GetMapping("/AddProfessorCourse")
    public void AddProfessorCourse(int ProfessorId, int CourseId){service.AddProfessorCourse(ProfessorId,CourseId);}

    @GetMapping("/ListSocialNetworksCatalog")
    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog(){return service.ListSocialNetworksCatalog();}

    @GetMapping("/GetSocialNetworksByIdProfessor")
    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(int Id){return service.GetSocialNetworksByIdProfessor(Id);}

    @GetMapping("/UpdateImage")
    public void UpdateImage(String Image,int Id){service.UpdateImage(Image,Id);}
}
