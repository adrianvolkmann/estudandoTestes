package com.volkmann.junit4;

import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LearningRulesTest {

	// Use @Rule to set up something that needs to be created a new,
	// or reset, for each test method.
	@Rule
	public Timeout methodTimeout = Timeout.seconds(5);

	// Use @ClassRule to set up something that can be reused by all
	// the test methods, if you can achieve that in a static method.
	// must be static!
	@ClassRule
	public static Timeout globalTimeout = Timeout.seconds(10);

	// lista das rules = https://github.com/junit-team/junit4/wiki/Rules

	//usar AssertTrow
	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void testTimeOut() throws InterruptedException {
		System.out.println("Indo dormir");
		TimeUnit.SECONDS.sleep(15);
		System.out.println("Acordando");
	}
}
