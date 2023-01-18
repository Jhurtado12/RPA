package co.com.bots.rpa.botsmsrpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.bots.rpa.botsmsrpa.entity.Log;
import co.com.bots.rpa.botsmsrpa.service.ILogService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/log")
public class LogController {
	
	@Autowired
	ILogService logService;
	
	@GetMapping
	public ResponseEntity<List<Log>> findAll() {
		
		return new ResponseEntity<List<Log>>(logService.findAll(), HttpStatus.OK);
		
	}

}
