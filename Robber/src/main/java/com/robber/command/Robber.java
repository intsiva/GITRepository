/**
 * All rights reserved.
 */
package com.robber.command;

/**
 * Command object for a Robber.
 * 
 * @author Sivaprakash Thiyagarajan (sivaprakasht@hotmail.com).
 */
public class Robber {

	/**
	 * Name of the robber.
	 */
	String name;
	
	/**
	 * User name of the robber, to log on.
	 */
	String userName;
	
	/**
	 * Password of the robber to log on.
	 */
	String password;

	/**
	 * Gets the name of the robber.
	 * 
	 * @return the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the robber.
	 * 
	 * @param name the name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the user name of the robber.
	 * 
	 * @return the userName.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name of the robber.
	 * 
	 * @param userName the userName to set.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password of the robber.
	 * 
	 * @return the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password for the robber.
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
