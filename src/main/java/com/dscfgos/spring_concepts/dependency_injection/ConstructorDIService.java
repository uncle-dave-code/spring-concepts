package com.dscfgos.spring_concepts.dependency_injection;

import com.dscfgos.spring_concepts.dependency_injection.utils.BaseReport;
import com.dscfgos.spring_concepts.dependency_injection.utils.DataGenerator;

public class ConstructorDIService {
    private final BaseReport report;
    private final DataGenerator dataGenerator;

    public ConstructorDIService(BaseReport report, DataGenerator dataGenerator) {
        this.report = report;
        this.dataGenerator = dataGenerator;
    }

    public void generateReport() {
        this.report.printData(this.dataGenerator.generateFakeData());
    }
}
