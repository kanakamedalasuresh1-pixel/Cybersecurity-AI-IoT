package com.vcube.cybersecurity_aiot.service;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.vcube.cybersecurity_aiot.ai.ThreatDetectionService;
	import com.vcube.cybersecurity_aiot.model.Device;
	import com.vcube.cybersecurity_aiot.repository.DeviceRepository;

	@Service
	public class DeviceService {

	    @Autowired
	    private DeviceRepository repository;

	    @Autowired
	    private ThreatDetectionService threatService;

	    public String saveDevice(Device device) {

	        String result = threatService.detectThreat(
	                device.getTemperature(),
	                device.getHumidity());

	        device.setStatus(result);

	        repository.save(device);

	        return result;
	    }

	    public List<Device> getAllDevices() {
	        return repository.findAll();
	    }
	}


