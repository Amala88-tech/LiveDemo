package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	public static void generateJvmReport(String jsonFiles) {
	File file=new File("target/cucumber-html-report");
	Configuration con=new Configuration(file,"ABCD");
con.addClassifications("Browser", "Chrome");
List<String>li=new ArrayList<String>();
li.add(jsonFiles);
ReportBuilder builder=new ReportBuilder(li,con);
builder.generateReports();
}

}
