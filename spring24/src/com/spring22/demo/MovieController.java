package com.spring22.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring22.demo.model.Employee;

@Controller
@RequestMapping("/movie")
public class MovieController {

	public static List<Employee> list = new ArrayList<>();
	//to spring the json values in output this annoation will require @JsonSetter("id")
	//on POJO class employee

	@RequestMapping("/view")
    public @ResponseBody List<Employee> getPerson(){
        List<Employee> l1 = getList();
		
        return l1;
    }
	
/*//running code
		@RequestMapping(value="/method7/{id}")
		@ResponseBody
		public String method7(@PathVariable("id") int id){
			Employee e = new Employee();
			e.setId(id);
			return "method7 with id="+e.getId();
		}

*/

/*	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<String> getMovie1(@PathVariable String name) {
		System.out.println("Hello "+name);
		//model.addAttribute("movie", name);
		return new ResponseEntity<String>(HttpStatus.OK);

	}*/
	public static List<Employee> getList() {
		Employee p1 = new Employee();
        p1.setId(1);
        p1.setName(new String[]{"h","k"});
        Employee p2 = new Employee();
        p2.setId(1);
        p2.setName(new String[]{"h","k"});
        Employee p3 = new Employee();
        p3.setId(1);
        p3.setName(new String[]{"h","k"});
        Employee p4 = new Employee();
        p4.setId(1);
        p4.setName(new String[]{"h","k"});
        Employee p5 = new Employee();
        p5.setId(1);
        p5.setName(new String[]{"h","k"});
        
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		return list;
	}
}
