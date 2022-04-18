package com.dscfgos.spring_concepts.dependency_injection.utils;

import lombok.Data;

@Data
public class ReportData {
    public ReportData(String name, Double value) {
        this.name = name;
        this.value = value;
    }
    private String name;
    private Double value;
}
