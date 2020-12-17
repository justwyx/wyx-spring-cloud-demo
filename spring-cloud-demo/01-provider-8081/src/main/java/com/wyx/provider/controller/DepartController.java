package com.wyx.provider.controller;

import com.wyx.provider.service.DepartService;
import com.wyx.provider.bean.Depart;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/provider/depart")
public class DepartController {
	@Resource
	private DepartService service;

	@PostMapping("/save")
	public boolean saveHandler(@RequestBody Depart depart) {
		return service.saveDepart(depart);
	}

	@DeleteMapping("/del/{id}")
	public boolean delHandler(@PathVariable("id") Integer id) {
		return service.removeDepartById(id);
	}

	@PutMapping("/update")
	public boolean updateHandler(@RequestBody Depart depart) {
		return service.modifyDepart(depart);
	}

	@GetMapping("/get/{id}")
	public Depart getHandler(@PathVariable("id") Integer id) {
		return service.getDepartById(id);
	}

	@GetMapping("/list")
	public List<Depart> listHandler() {
		return service.listAllDeparts();
	}
}
