package com.dscfgos.spring_concepts.dependency_injection;

import com.dscfgos.spring_concepts.dependency_injection.utils.BaseReport;
import com.dscfgos.spring_concepts.dependency_injection.utils.DataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringWaysDIService {
    @Autowired
    private BaseReport report;
    @Autowired
    private DataGenerator dataGenerator;

    public void generateReport() {
        this.report.printData(this.dataGenerator.generateFakeData());
    }
}
