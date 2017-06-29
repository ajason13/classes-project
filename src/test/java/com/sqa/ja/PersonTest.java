package com.sqa.ja;

import org.testng.annotations.*;

public class PersonTest {

	@Test
	public void f() {
		Person[] people = new Person[4];
		people[0] = new Person();
		people[1] = new Person("Jason", "Student");
		people[2] = new Person("Bob", "QA Analyst", 30, 'M');
		people[3] = new Person("Sharon", "Manager", 55, 'F', "Somewhere", 170, true);
		for (int i = 0; i < people.length; i++) {
			System.out.println("Person Details " + (i + 1) + ": " + people[i]);
			people[i].move((int) Math.ceil(Math.random() * 10));
			people[i].doWork("calls school");
			people[i].sleep();
		}
		System.out.println();
		Bug[] bugs = new Bug[4];
		bugs[0] = new Bug();
		bugs[1] = new Bug(1, "Bob Bug");
		bugs[2] = new Bug(2, "John", "John Bug", "02/02/2017");
		bugs[3] = new Bug(3, "Jason", "Jason Bug", "01/01/2017", "Bug found by Jason", 'A', "Windows", 10, false);
		for (int i = 0; i < bugs.length; i++) {
			System.out.println("Bug Details " + (i + 1) + ": " + bugs[i]);
			bugs[i].recreateBugActivity();
			bugs[i].applyBugFix();
			bugs[i].findSimilarBugs();
		}
	}
}
