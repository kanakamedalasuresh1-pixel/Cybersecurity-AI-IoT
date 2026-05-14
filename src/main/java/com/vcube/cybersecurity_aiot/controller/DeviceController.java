package com.vcube.cybersecurity_aiot.controller;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.vcube.cybersecurity_aiot.model.Device;
	import com.vcube.cybersecurity_aiot.service.DeviceService;

	@RestController
	@RequestMapping("/devices")
	public class DeviceController {

	    @Autowired
	    private DeviceService service;

	    @PostMapping("/add")
	    public String addDevice(@RequestBody Device device) {

	        return service.saveDevice(device);
	    }

	    @GetMapping("/all")
	    public List<Device> getAllDevices() {

	        return service.getAllDevices();
	    }
	}

