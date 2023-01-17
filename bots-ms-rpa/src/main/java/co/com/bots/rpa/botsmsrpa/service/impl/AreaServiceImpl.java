package co.com.bots.rpa.botsmsrpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.bots.rpa.botsmsrpa.entity.Area;
import co.com.bots.rpa.botsmsrpa.repository.IAreaRepository;
import co.com.bots.rpa.botsmsrpa.service.IAreaService;

@Service
public class AreaServiceImpl implements IAreaService {

	@Autowired
	IAreaRepository areaRepository;
	
	@Override
	public List<Area> findAll() {
		
		return areaRepository.findAll();
	
	}

	
	
}
