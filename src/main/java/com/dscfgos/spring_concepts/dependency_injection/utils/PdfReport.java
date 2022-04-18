package com.dscfgos.spring_concepts.dependency_injection.utils;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("pdf-report")
public class PdfReport implements BaseReport {
    @Override
    public void printData(List<ReportData> data) {
        if (data != null && !data.isEmpty()) {
            System.out.println("Generating PDF Report:");

            data.forEach(item -> System.out.printf("%s : %f%n", item.getName(), item.getValue()));
        }
    }
}
