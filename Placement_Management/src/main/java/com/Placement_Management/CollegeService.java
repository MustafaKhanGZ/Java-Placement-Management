package com.Placement_Management;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private CollegeJPA repo;

    public List<College> searchAll() {
        return repo.findAll();
    }

    public void save(College college) {
        repo.save(college);
    }

    public College get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
