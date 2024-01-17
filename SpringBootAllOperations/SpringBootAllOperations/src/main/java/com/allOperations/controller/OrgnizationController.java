package com.allOperations.controller;

import com.allOperations.entity.Orgnization;
import com.allOperations.service.OrgnizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/org")
public class OrgnizationController {

private OrgnizationService orgnizationService;

@PostMapping("/listoforgnization")
public List<Orgnization> ListOfOrgnization(List<Orgnization> orgnizationList){
    List<Orgnization> list=orgnizationService.saveListDetails(orgnizationList);
    return list;
}

@PostMapping("/savedetails")
public Orgnization saveOrgnization(Orgnization orgnization){
    return orgnizationService.saveDetails(orgnization);
}

@GetMapping("/getbyid/{index}")
public Optional<Orgnization> getdetailsById(@PathVariable int index){
   return orgnizationService.getDetailsById(index);
}

@GetMapping("/getalldetails")
public List<Orgnization>getdetailslist(){
   return orgnizationService.getAllDetails();
}








}
