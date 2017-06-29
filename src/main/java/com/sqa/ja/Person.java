/**
 * File Name: Person.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 28, 2017
 */
package com.sqa.ja;

/**
 * Person //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class Person {

	private String name, address, jobTitle;

	private int age;

	private char sex;

	private double weight;

	private boolean married;

	public Person() {
		this.name = "John Doe";
		this.jobTitle = "Unemployeed";
		this.age = 18;
		this.sex = 'M';
		this.address = "Homeless";
		this.weight = 100;
		this.married = false;
	}

	public Person(String name, String jobTitle) {
		this();
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public Person(String name, String jobTitle, int age, char sex) {
		this(name, jobTitle);
		this.age = age;
		this.sex = sex;
	}

	/**
	 * @param name
	 * @param jobTitle
	 * @param age
	 * @param sex
	 * @param address
	 * @param weight
	 * @param married
	 */
	public Person(String name, String jobTitle, int age, char sex, String address, double weight, boolean married) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.weight = weight;
		this.married = married;
	}

	/**
	 * @param string
	 */
	public void doWork(String task) {
		System.out.println(this.name + " does work and " + task + ".");
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the sex
	 */
	public char getSex() {
		return this.sex;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * @return the married
	 */
	public boolean isMarried() {
		return this.married;
	}

	/**
	 * @param ceil
	 */
	public void move(int miles) {
		System.out.println(this.name + " walks " + miles + " miles.");
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param married
	 *            the married to set
	 */
	public void setMarried(boolean married) {
		this.married = married;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 *
	 */
	public void sleep() {
		System.out.println(this.name + " goes to sleep.");
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", jobTitle=" + this.jobTitle + ", age=" + this.age + ", sex=" + this.sex
				+ ", address=" + this.address + ", weight=" + this.weight + ", married=" + this.married + "]";
	}
}
