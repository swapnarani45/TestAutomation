package com.valuemomentum.retail.TestAutomation;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners1 implements ITestListener {

 

    protected static ExtentReports reports;
    protected static ExtentTest test;
    protected ExtentSparkReporter spark;

 

    @Override
    public void onTestStart(ITestResult result) {
        test = reports.createTest(result.getMethod().getMethodName());
    }

 

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, result.getMethod().getMethodName() + "Test Passed");
    }

 

    @Override
    public void onTestFailure(ITestResult result) {
        // test screen shot code here
        WebDriverHelper.ScreenShot(result.getMethod().getMethodName());
        test.log(Status.FAIL, "Test Failed");
        test.addScreenCaptureFromPath("C:\\Users\\navee\\Trainings\\testautomation\\screenshot\\"+result.getMethod().getMethodName()+".png");
        //test.log(Status.FAIL, "C:\\Users\\navee\\Trainings\\testautomation\\screenshot\\"+result.getMethod().getMethodName()+".png");
    }

 

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped");
    }

 

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

 

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestFailedWithTimeout(result);
    }

 

    @Override
    public void onStart(ITestContext context) {
        reports = new ExtentReports();
        spark = new ExtentSparkReporter(
                "target/" + new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms")+ "-reports.html");
    }

 

    @Override
    public void onFinish(ITestContext context) {
        reports.attachReporter(spark);
        reports.flush();
    }

 

}