package com.example.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.model.School;
import com.example.school.repository.SchoolRepository;

@Service
public class SchoolService {
	 @Autowired
	    private SchoolRepository schoolRepository;

	    public School addSchool(School school){
	        return schoolRepository.save(school);
	    }
	    public List<School> fetchSchools(){
	        return schoolRepository.findAll();
	    }
	    public School fetchSchoolById(int id){
	        return schoolRepository.findById(id).orElse(null);
	    }

}
