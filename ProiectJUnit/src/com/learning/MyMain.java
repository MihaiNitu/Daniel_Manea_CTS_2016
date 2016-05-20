package com.learning;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.JUnitTestSuite;

public class MyMain {

	public static void main(String[] args) {
		
	  Result result = JUnitCore.runClasses(JUnitTestSuite.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful() ? "Test Suite a rulat cu success!" : "Test Suite a avut erori!");

	}

}
