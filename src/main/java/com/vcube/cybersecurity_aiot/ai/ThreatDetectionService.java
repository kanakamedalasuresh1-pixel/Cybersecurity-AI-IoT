package com.vcube.cybersecurity_aiot.ai;

import org.springframework.stereotype.Service;

@Service

public class ThreatDetectionService {
	 public String detectThreat(double temperature, double humidity) {

	        if (temperature > 80 || humidity > 90) {
	            return "ATTACK DETECTED";
	        }

	        return "DEVICE SAFE";
	    }
	}


