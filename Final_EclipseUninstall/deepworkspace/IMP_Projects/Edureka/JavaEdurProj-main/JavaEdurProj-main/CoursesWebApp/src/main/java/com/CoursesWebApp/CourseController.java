package com.CoursesWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CourseController {

	@RequestMapping("getCourse")
	private String singleCourse(HttpServletRequest req) {
		String cname = req.getParameter("cname");

		HttpSession session = req.getSession();
		session.setAttribute("cname", cname);

		System.out.println("Cname is = " + cname);
		return "getCourseDetails";

	}

	@RequestMapping("get1Course")
	private String single1Course(String cname, HttpSession session) {

		session.setAttribute("cname", cname);

		System.out.println("Cname is = " + cname);
		return "getCourseDetails";

	}

	@RequestMapping("get2Course")
	private String single2Course(@RequestParam("cname") String cname, HttpSession session) {

		session.setAttribute("cname", cname);

		System.out.println("Cname is = " + cname);
		return "getCourseDetails";

	}

	@RequestMapping("get3Course")
	private ModelAndView single3Course(@RequestParam("cname") String cname) {

		ModelAndView mv = new ModelAndView();

		System.out.println("Cname is = " + cname);

		mv.addObject("cname", cname);
		mv.setViewName("getCourseDetails");

		return mv;

	}

	@RequestMapping("course")
	public String course() {
		System.out.println("My Normal Controller");

		// return "Course.jsp"; // application.properties in added
		// spring.mvc.view.suffix=.jsp
		return "Course";
	}

	@RequestMapping("/hello")
	@ResponseBody
	private String hello() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
