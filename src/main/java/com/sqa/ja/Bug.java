/**
 * File Name: Bug.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 28, 2017
 */
package com.sqa.ja;

/**
 * Bug //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class Bug {

	int bugId;

	String reporterName, bugName, operatingSystem, date, bugDetails;

	char bugCategory;

	double frequency;

	boolean isActive;

	public Bug() {
		this.bugId = 0;
		this.reporterName = "N/A";
		this.bugName = "N/A";
		this.date = "N/A";
		this.bugDetails = "N/A";
		this.bugCategory = 'A';
		this.operatingSystem = "N/A";
		this.frequency = 1;
		this.isActive = true;
	}

	public Bug(int bugId, String bugName) {
		this();
		this.bugId = bugId;
		this.bugName = bugName;
	}

	public Bug(int bugId, String reporterName, String bugName, String date) {
		this(bugId, reporterName);
		this.bugName = bugName;
		this.date = date;
	}

	/**
	 * @param bugId
	 * @param reporterName
	 * @param bugName
	 * @param date
	 * @param bugDetails
	 * @param bugCategory
	 * @param operatingSystem
	 * @param frequency
	 * @param isActive
	 */
	public Bug(int bugId, String reporterName, String bugName, String date, String bugDetails, char bugCategory,
			String operatingSystem, double frequency, boolean isActive) {
		this.bugId = bugId;
		this.reporterName = reporterName;
		this.bugName = bugName;
		this.date = date;
		this.bugDetails = bugDetails;
		this.bugCategory = bugCategory;
		this.operatingSystem = operatingSystem;
		this.frequency = frequency;
		this.isActive = isActive;
	}

	/**
	 *
	 */
	public void applyBugFix() {
		System.out.println(this.bugName + " is being fixed.");
	}

	/**
	 *
	 */
	public void findSimilarBugs() {
		System.out.println("Finding similar bugs to " + this.bugName);
	}

	/**
	 * @return the bugCategory
	 */
	public char getBugCategory() {
		return this.bugCategory;
	}

	/**
	 * @return the bugDetails
	 */
	public String getBugDetails() {
		return this.bugDetails;
	}

	/**
	 * @return the bugId
	 */
	public int getBugId() {
		return this.bugId;
	}

	/**
	 * @return the bugName
	 */
	public String getBugName() {
		return this.bugName;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * @return the frequency
	 */
	public double getFrequency() {
		return this.frequency;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	/**
	 * @return the reporterName
	 */
	public String getReporterName() {
		return this.reporterName;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return this.isActive;
	}

	/**
	 *
	 */
	public void recreateBugActivity() {
		String active = "active";
		if (!this.isActive) {
			active = "not active";
		}
		System.out.println(this.bugName + " is " + active + ".");
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @param bugCategory
	 *            the bugCategory to set
	 */
	public void setBugCategory(char bugCategory) {
		this.bugCategory = bugCategory;
	}

	/**
	 * @param bugDetails
	 *            the bugDetails to set
	 */
	public void setBugDetails(String bugDetails) {
		this.bugDetails = bugDetails;
	}

	/**
	 * @param bugId
	 *            the bugId to set
	 */
	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	/**
	 * @param bugName
	 *            the bugName to set
	 */
	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	/**
	 * @param operatingSystem
	 *            the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @param reporterName
	 *            the reporterName to set
	 */
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bug [bugId=" + this.bugId + ", reporterName=" + this.reporterName + ", bugName=" + this.bugName
				+ ", operatingSystem=" + this.operatingSystem + ", date=" + this.date + ", bugDetails="
				+ this.bugDetails + ", bugCategory=" + this.bugCategory + ", frequency=" + this.frequency
				+ ", isActive=" + this.isActive + "]";
	}
}
