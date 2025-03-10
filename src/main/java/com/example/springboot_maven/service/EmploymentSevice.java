package com.example.springboot_maven.service;

import com.example.entity.Employment;
import com.example.repository.EmploymentRepository;
import com.example.repository.EmploymentRepository.LocationCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmploymentService {
    @Autowired
    private EmploymentRepository employmentRepository;

    public Map<String, Object> getDashboardData() {
        Map<String, Object> result = new HashMap<>();
        result.put("companyCount", employmentRepository.countDistinctCompanies());
        result.put("employedCount", employmentRepository.countTotalEmployed());
        result.put("locationDistribution", employmentRepository.getLocationDistribution()
                .stream()
                .collect(Collectors.toMap(
                        LocationCount::getLocation,
                        LocationCount::getCount
                )));
        return result;
    }
}