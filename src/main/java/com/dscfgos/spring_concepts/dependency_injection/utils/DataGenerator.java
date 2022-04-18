package com.dscfgos.spring_concepts.dependency_injection.utils;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataGenerator{
    public List<ReportData> generateFakeData() {
        return List.of(
                new ReportData("Name A 1", 12.23),
                new ReportData("Name A 2", 45.56),
                new ReportData("Name A 3", 23.94),
                new ReportData("Name A 4", 87.83),
                new ReportData("Name A 5", 34.12)
        );
    }
}
