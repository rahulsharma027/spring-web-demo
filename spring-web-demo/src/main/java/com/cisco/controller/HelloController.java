package com.cisco.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cisco.dao.ProfileDao;
import com.cisco.model.Profile;

@Controller
@RequestMapping("/webapi")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET, path = "/time")
	public ModelAndView getTime() {
		LocalTime time = LocalTime.now();
		ModelAndView mav = new ModelAndView("display", "obj", time);
		return mav;
	}
	@Autowired
    private ProfileDao profileDao;
	@RequestMapping(method = RequestMethod.GET, path = "/profiles")
    public ModelAndView getProfiles() {
        List<Profile> profiles = profileDao.getAllProfiles();
        ModelAndView mav2 = new ModelAndView("profile-list", "profileList", profiles);
        return mav2;
    }
}
