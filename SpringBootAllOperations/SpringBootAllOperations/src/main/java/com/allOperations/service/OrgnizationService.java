package com.allOperations.service;

import com.allOperations.entity.Orgnization;
import com.allOperations.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrgnizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public Orgnization saveDetails(Orgnization orgnization){
        Orgnization orgnization1=organizationRepository.save(orgnization);
        return  orgnization1;
    }

    public List<Orgnization> saveListDetails(List<Orgnization> orgnizationList){
        List<Orgnization> orgnizationList1=organizationRepository.saveAll(orgnizationList);
        return orgnizationList1;
    }

    public List<Orgnization> getAllDetails(){
        List<Orgnization> list=organizationRepository.findAll();
        return list;
    }

    public Optional<Orgnization> getDetailsById(int index){
        Optional<Orgnization> resultOrgnization=organizationRepository.findById(index);
        return resultOrgnization;
    }
}
