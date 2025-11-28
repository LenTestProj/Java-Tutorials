package com.telecom.SpringBootWeb2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("addAlien")
    //int num1, int num2 ar e query parameters
    public String addAlien(@ModelAttribute("alien1") Alien alien){
        return "result";
    }

    @RequestMapping("addAlien2")
    //int num1, int num2 ar e query parameters
    public ModelAndView addAlien2(int aid, String aname, ModelAndView mv){
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);

        mv.addObject("alien", alien);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("add")
    //int num1, int num2 ar e query parameters
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv){
        int result = num+num2;
        
        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("add-alternate-2")
    //int num1, int num2 ar e query parameters
    public String add_alternate_2(@RequestParam("num1") int num, int num2, Model model){
        int result = num+num2;
        
        model.addAttribute("num1", num);
        model.addAttribute("num2", num2);
        model.addAttribute("result",result);
        return "result";
    }
    
    @RequestMapping("add-alternate")
    public String addAlternate(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1+num2;
        
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("result",result);
        return "result.jsp";
    }
}
