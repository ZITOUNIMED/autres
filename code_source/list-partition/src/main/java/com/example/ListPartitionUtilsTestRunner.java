package com.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.example.utils.ListPartitionUtilsTest;

public class ListPartitionUtilsTestRunner {

	public static void main(String[] args) {
		System.out.println("Run tests:");
		Result result = JUnitCore.runClasses(ListPartitionUtilsTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		

		System.out.println("All test are passed: "+ result.wasSuccessful());
		System.out.println("Test runned is " + result.getRunTime() + " milliseconds");
		result.getRunTime();
	}

}
