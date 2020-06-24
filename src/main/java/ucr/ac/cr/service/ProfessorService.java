package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.ProfessorRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    public void AddProfessor(int Id,String Username,String Password,int IsAdministrator,String Status,
                      String Name,String LastName, String Mail,String Image,int ProvinceId,int CantonId,
                             int DistrictId,int AcademicDegree){repository.addProfessor(Id,Username,Password,IsAdministrator,Status,Name,LastName,Mail,Image,ProvinceId,CantonId,DistrictId,AcademicDegree);}

    public void UpdateProfessor(int Id,String Username,String Password,int IsAdministrator,String Status,
                             String Name,String LastName, String Mail,String Image,int ProvinceId,int CantonId,
                             int DistrictId,int AcademicDegree){repository.UpdateProfessor(Id,Username,Password,IsAdministrator,Status,Name,LastName,Mail,Image,ProvinceId,CantonId,DistrictId,AcademicDegree);}

    public List<SelectProfessorResult> ListAllProfessors(){return repository.ListAllProfessors();}

    public GetProfessorByIdResult getProfessorById(int Id){return repository.getProfessorById(Id);}

    public void DeleteProfessor(int Id){repository.DeleteProfessor(Id);}

    public List<SelectAcademicDegreeResult> ListAcademicDegree(){return  repository.ListAcademicDegree();}

    public void addSocialNetwork(int Id, int StudentId,String Url,int SocialNetworksNameId){repository.addSocialNetwork(Id,StudentId,Url,SocialNetworksNameId);}

    public void AddProfessorCourse(int ProfessorId, int CourseId){repository.AddProfessorCourse(ProfessorId,CourseId);}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog(){return repository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(int Id){return repository.GetSocialNetworksByIdProfessor(Id);}

    public void UpdateImage(String Image,int Id){repository.UpdateImage(Image,Id);}
}
