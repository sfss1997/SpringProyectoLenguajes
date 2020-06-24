package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.LocationRepository;
import ucr.ac.cr.repository.ProfessorRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LocationService {

    @Autowired
    private LocationRepository repository;

    public List<Location> ListAllProvinces(){return  repository.ListAllProvinces();}

    public List<Location> GetCantonsByIdProvince(int Id){return repository.GetCantonsByIdProvince(Id);}

    public List<Location> GetDistrictsByIdCanton(int Id){return repository.GetDistrictsByIdCanton(Id);}
}
