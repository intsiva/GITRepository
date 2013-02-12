/**
 * 
 */
package com.robber.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.robber.command.Robber;

/**
 * @author Sivaprakash Thiyagarajan (sivaprakasht@hotmail.com).
 */
public class RobberDaoImpl implements RobberDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Gets the password for the robber for authentication.
	 */
	public String getPassword(Robber robber) {
		jdbcTemplate.query("");
		return null;
	}

}
