package com.rolandbalogh.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolandbalogh.example.exception.ResourceNotFoundException;
import com.rolandbalogh.example.model.Meter;
import com.rolandbalogh.example.repository.ClientRepository;
import com.rolandbalogh.example.repository.MeterRepository;

@RestController
public class MeterController {

    @Autowired
    private MeterRepository meterRepository;

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients/{clientId}")
    public List<Meter> getAllMeterByClientId(@PathVariable (value = "clientId") Long clientId) {
        return meterRepository.findByClientId(clientId);
    }
    
    @GetMapping("/clients/{clientId}/total/{year}")
    public List<Meter> getTotalMeterByClientIdByYear(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByYearLastTotal(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/oneyear")
    public List<Meter> getOneYearMeterByClientId(@PathVariable (value = "clientId") Long clientId) {
        return meterRepository.findByClientIdOneYear(clientId);
    }
    

    @PostMapping("/clients/{clientId}/post")
    public Meter createMeter(@PathVariable (value = "clientId") Long clientId,
                                 @Valid @RequestBody Meter meter) {
        return clientRepository.findById(clientId).map(client -> {
            meter.setClient(client);
            return meterRepository.save(meter);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/january/{year}")
    public List<Meter> getSpecMeterByClientIdYearJanuary(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearJanuary(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/february/{year}")
    public List<Meter> getSpecMeterByClientIdYearFebruary(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearFebruary(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/march/{year}")
    public List<Meter> getSpecMeterByClientIdYearMarch(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearMarch(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/april/{year}")
    public List<Meter> getSpecMeterByClientIdYearApril(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearApril(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/may/{year}")
    public List<Meter> getSpecMeterByClientIdYearMay(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearMay(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/june/{year}")
    public List<Meter> getSpecMeterByClientIdYearJune(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearJune(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/july/{year}")
    public List<Meter> getSpecMeterByClientIdYearJuly(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearJuly(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/august/{year}")
    public List<Meter> getSpecMeterByClientIdYearAugust(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearAugust(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/september/{year}")
    public List<Meter> getSpecMeterByClientIdYearSeptember(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearSeptember(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/october/{year}")
    public List<Meter> getSpecMeterByClientIdYearOctober(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearOctober(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/november/{year}")
    public List<Meter> getSpecMeterByClientIdYearNovember(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearFebruary(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
    
    @GetMapping("/clients/{clientId}/december/{year}")
    public List<Meter> getSpecMeterByClientIdYearDecember(@PathVariable (value = "clientId") Long clientId,
    		@PathVariable (value = "year") String year) {
    	return clientRepository.findById(clientId).map(client -> {
            return meterRepository.findByIdYearDecember(year);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }

}