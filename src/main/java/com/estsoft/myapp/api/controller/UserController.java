package com.estsoft.myapp.api.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.estsoft.myapp.domain.*;
import com.estsoft.myapp.service.*;
import com.ff.dto.*;

@Controller
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping("/list")
	public Object list() {

		List<User> list = userService.getAllUsers();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "success");
		map.put("data", list);

		return map;
	}
	
	@ResponseBody
	@RequestMapping("/input")
	public JSONResult InputString(@RequestParam(value="name", required=true, defaultValue="" ) String name,
									@RequestParam(value="id", required=true, defaultValue="" ) String id,
									@RequestParam(value="password", required=true, defaultValue="" ) String password ) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		
		return JSONResult.success(1);
	}
}
