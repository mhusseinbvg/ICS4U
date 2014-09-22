package com.bayviewglen.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bayviewglen.filler.Example;

public class ExampleTest {

	@Test
	public void evenTestMethodA() {
		assertEquals("This is a an even number", 4, Example.methodA(2));
	}
	
	@Test
	public void oddTestMethodA() {
		assertEquals("This is a an odd number", 3, Example.methodA(1));
	}

	@Test
	public void testMethodB() {
		assertEquals("This should always return one more than the input.", 3, Example.methodB(2));
	}

}
