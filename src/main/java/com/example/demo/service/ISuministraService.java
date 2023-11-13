package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;


public interface ISuministraService {

	List<Suministra> listSuministra();
	
	Suministra sumPorId(int id);
	
	Suministra saveSuministra(Suministra suministra);
	
	Suministra updateSuministra(Suministra suministra);
	
	void deleteSuministra(int id);
}
