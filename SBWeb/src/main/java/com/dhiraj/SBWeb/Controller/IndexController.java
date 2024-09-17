package com.dhiraj.SBWeb.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @GetMapping("/")
    public String index()
    {
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest request, HttpSession session)
    {
        int iNo1 = Integer.parseInt(request.getParameter("num1"));
        int iNo2 = Integer.parseInt(request.getParameter("num2"));

        int iResult = iNo1 + iNo2;
        session.setAttribute("iResult" , iResult);
        return "result.jsp";
    }
}
