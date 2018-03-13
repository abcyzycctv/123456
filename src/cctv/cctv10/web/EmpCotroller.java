package cctv.cctv10.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cctv.cctv10.pojo.Emp;
import cctv.cctv10.service.ServiceEmp;

@Controller
public class EmpCotroller {
     @Resource
     private ServiceEmp es;
     
     @RequestMapping(value = "/list")
     
     public String fnl(HttpServletResponse response,EmpCotroller Map map){
    	 String sql = "salect* from emp";
    	 List<Emp> eList = es.findAll();
    	 map.put("a",el);
    	 return "aa";
     }
     @RequestMapping("/deleteEmp")
    
     }

