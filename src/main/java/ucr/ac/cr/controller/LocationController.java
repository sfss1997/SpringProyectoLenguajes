package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.LocationService;
import ucr.ac.cr.service.ProfessorService;


import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping("/ListAllProvinces")
    public List<Location> ListAllProvinces(){return  service.ListAllProvinces();}

    @GetMapping("/GetCantonsByIdProvince")
    public List<Location> GetCantonsByIdProvince(@RequestParam(value = "id") Integer Id){return service.GetCantonsByIdProvince(Id);}

    @GetMapping("/GetDistrictsByIdCanton")
    public List<Location> GetDistrictsByIdCanton(@RequestParam(value = "id") Integer Id){return service.GetDistrictsByIdCanton(Id);}
}
