package com.dscfgos.spring_concepts.dependency_injection;

import com.dscfgos.spring_concepts.dependency_injection.utils.BaseReport;
import com.dscfgos.spring_concepts.dependency_injection.utils.DataGenerator;

public class SettersDIService {
    private BaseReport report;
    private DataGenerator dataGenerator;

    public void setReport(BaseReport report) {
        this.report = report;
    }

    public void setDataGenerator(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

    public void generateReport() {
        this.report.printData(this.dataGenerator.generateFakeData());
    }
}
