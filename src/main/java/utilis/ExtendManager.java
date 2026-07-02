package utilis;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        String path = System.getProperty("user.dir")
                + "/reports/ExtentReport.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("Automation Report");
        reporter.config().setDocumentTitle("Selenium Execution Report");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Sireesha");
        extent.setSystemInfo("Environment", "QA");
    
        
        return extent;
  }
}
