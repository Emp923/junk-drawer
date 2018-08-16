package com.techelevator.npgeek.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDao;
import com.techelevator.npgeek.model.Weather;
import com.techelevator.npgeek.model.WeatherDao;

@Controller
@SessionAttributes("typeOfTemp")
public class HomeController {
	
	@Autowired
	private ParkDao parkDao;
	
	@Autowired
	private WeatherDao weatherDao;
	
	@Autowired
	private SurveyDao surveyDao;

	@RequestMapping(path= {"/","home"}, method=RequestMethod.GET)
	public String displayHomePage(HttpServletRequest request) {
		List<Park> parks = parkDao.getBasicParkInfo();
		request.setAttribute("parks", parks);
		return "home";
	}
	
	@RequestMapping(path= {"/","home"}, method=RequestMethod.POST)
	public String redirectToDetail(@RequestParam String parkCode, HttpServletRequest request) {
		
		
		
		return "redirect:/parkDetail";
	}
	
	@RequestMapping(path="/parkDetail", method=RequestMethod.GET)
	public String displayParkDetail(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		
		String parkCode = request.getParameter("parkCode");
		if (parkCode == null) {
			parkCode = "cvnp";
		}
		Park park = parkDao.getParkInfoByCode(parkCode);
		request.getParameter("typeOfTemp");
		List<Weather> weather = weatherDao.getWeatherByParkCode(parkCode);
		request.setAttribute("weather", weather);
		
		session.setAttribute("parkCode", parkCode);
		session.setAttribute("park", park);
		session.setAttribute("weather", weather);
		
		
		/*
		String parkCode = request.getParameter("parkCode");
		request.setAttribute("parkCode", parkCode);
		HttpSession session = request.getSession();
		parkCode = request.getParameter("parkCode");
		String typeOfTemp = request.getParameter("typeOfTemp");
		session.setAttribute("parkCode", parkCode);
		session.setAttribute("typeOfTemp", typeOfTemp);
		
		if  (parkCode == null && typeOfTemp == null) {
			parkCode = "cvnp";
			typeOfTemp = "1";
		}
		
		List<Park> parks = parkDao.getBasicParkInfo();
		
		for (Park p : parks) {
			if (p.getParkCode().equals(parkCode)) {
				request.setAttribute("park", p);
			}
		}
		
		parkCode = parkCode.toUpperCase();
		List<Weather> weather = weatherDao.getWeatherByParkCode(parkCode);
		request.setAttribute("weather", weather);
		session.setAttribute("weather", weather);
		session.setAttribute("parks", parks);
		*/
		
		/*
		List<Integer> tempsHighF = new ArrayList<>();
		List<Integer> tempsLowF = new ArrayList<>();
		for (Weather w : weather) {
			tempsHighF.add(w.getHigh());
			tempsLowF.add(w.getLow());
		}
		List<Integer> tempsHighC = new ArrayList<>();
		List<Integer> tempsLowC = new ArrayList<>();
		for (Integer i : tempsHighF) {
			tempsHighC.add(weatherDao.fToC(i));
		}
		for (Integer i : tempsLowF) {
			tempsLowC.add(weatherDao.fToC(i));
		}
		request.setAttribute("tempsHighF", tempsHighF);
		request.setAttribute("tempsLowF", tempsLowF);
		request.setAttribute("tempsHighC", tempsHighC);
		request.setAttribute("tempsLowC", tempsLowC);
		*/
		return "detail";
	}
	
	@RequestMapping(path="/parkDetail", method=RequestMethod.POST)
	public String changeTempType(@RequestParam String typeOfTemp, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String parkCode = (String)session.getAttribute("parkCode");
		session.setAttribute("typeOfTemp", typeOfTemp);
		request.setAttribute("parkCode", parkCode);
		request.setAttribute("park", session.getAttribute("park"));
		
		if (parkCode == null) {
			parkCode = "cvnp";
		} else if (parkCode != null) {
			parkCode = request.getParameter("parkCode");
		}
		
		
		return "detail";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.GET)
	public String displaySurvey(HttpServletRequest request) {
		List<Park> parks = parkDao.getBasicParkInfo();
		request.setAttribute("parks", parks);
		return "survey";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String surveyRedirect(@RequestParam String parkCode,
								@RequestParam String emailAddress,
								@RequestParam String state,
								@RequestParam String activityLevel) {
		
		Survey survey = new Survey();
		survey.setParkCode(parkCode);
		survey.setEmailAddress(emailAddress);
		survey.setState(state);
		survey.setActivityLevel(activityLevel);
		// saves form info
		
		surveyDao.save(survey);
		
		return "redirect:/viewFavorites";
	}
	
	@RequestMapping("/viewFavorites")
	public String displayFavorites(HttpServletRequest request) {
		List<Survey> parkRank = surveyDao.getParkRank();
		request.setAttribute("parkRank", parkRank);
		return "favorites";
	}
	
}
