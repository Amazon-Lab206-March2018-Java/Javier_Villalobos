package com.javier.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javier.driverslicense.models.License;
import com.javier.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {

	
	private final LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository=licenseRepository;
	}
	
	public void addLicense(License license) {
		licenseRepository.save(license);
	}

	public List<License> findAll() {
		return licenseRepository.findAll();
	}
	
}
