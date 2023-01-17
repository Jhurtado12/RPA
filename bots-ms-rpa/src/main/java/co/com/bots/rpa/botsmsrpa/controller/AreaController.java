package co.com.bots.rpa.botsmsrpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.bots.rpa.botsmsrpa.entity.Area;
import co.com.bots.rpa.botsmsrpa.service.IAreaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/area")
public class AreaController {

	@Autowired
	IAreaService areaService;

	@GetMapping
	public ResponseEntity<List<Area>> findAll() {

		return new ResponseEntity<List<Area>>(areaService.findAll(), HttpStatus.OK);

	}

}
