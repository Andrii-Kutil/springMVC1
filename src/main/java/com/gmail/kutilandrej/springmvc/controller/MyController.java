package com.gmail.kutilandrej.springmvc.controller;

import com.gmail.kutilandrej.springmvc.model.Employee;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {

  @RequestMapping("/test")
  public String showFirstView() {
    return "test";
  }

//  @RequestMapping("/askDetails")
//  public String askEmployeeDetails() {
//    return "askEmployeeDetails";
//  }

  @RequestMapping("/askDetails")
  public String askEmpDetails(Model model) {
    //could change data
    model.addAttribute("employee", new Employee());
    return "askEmployeeDetails";
  }

//  @RequestMapping("/showDetails")
//  public String showEmpDetails(HttpServletRequest request, Model model) {
//    String name = request.getParameter("employeeName");
//    name = "Mr. " + name;
//    model.addAttribute("nameAttribute", name);
//    return "showEmployeeDetails";
//  }

  //  @RequestMapping("/showDetails")
//  public String showEmpDetails(@RequestParam("employeeName") String name, Model model) {
//    name = "Mr. " + name;
//    model.addAttribute("nameAttribute", name);
//    return "showEmployeeDetails";
//  }
  @RequestMapping("/showDetails")
  public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "askEmployeeDetails";
    }
    return "showEmployeeDetails";
  }
}
