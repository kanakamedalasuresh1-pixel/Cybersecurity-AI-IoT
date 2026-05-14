package com.vcube.cybersecurity_aiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.cybersecurity_aiot.model.Device;

public interface DeviceRepository extends JpaRepository<Device,Long>{
	

}
