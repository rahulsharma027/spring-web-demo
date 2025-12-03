package com.cisco.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cisco.model.Profile;

@Repository
public class ProfileDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Profile> getAllProfiles() {
        String query = "select * from profile";
        List<Profile> list = jdbcTemplate.query(query, 
        		(rs, rowNum) -> new Profile(rs.getInt(1), rs.getString(2),rs.getDate(3).toLocalDate()));
        return list;
        }
    }