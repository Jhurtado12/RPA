package co.com.bots.rpa.botsmsrpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.bots.rpa.botsmsrpa.entity.Log;
import co.com.bots.rpa.botsmsrpa.repository.ILogRepository;
import co.com.bots.rpa.botsmsrpa.service.ILogService;

@Service
public class LogServiceImpl implements ILogService {

	@Autowired
	ILogRepository logRepository;

	@Override
	public List<Log> findAll() {
		
		return logRepository.findAll();
	
	}
	
	
}
