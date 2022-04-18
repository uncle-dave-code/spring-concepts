package com.dscfgos.spring_concepts.dependency_injection;

import com.dscfgos.spring_concepts.dependency_injection.utils.DataGenerator;
import com.dscfgos.spring_concepts.dependency_injection.utils.ReportData;
import com.dscfgos.spring_concepts.dependency_injection.utils.XlsReport;

import java.util.List;

public class NoDIService {
    public void generateReport() {
        DataGenerator dataUtils = new DataGenerator();
        List<ReportData> reportData = dataUtils.generateFakeData();

        //NEED TO CHANGE IMPLEMENTATION FOR DIFERENT REPORT TYPE
        //PdfReport report = new PdfReport();
        XlsReport report = new XlsReport();
        report.printData(reportData);
    }
}
