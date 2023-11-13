package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

public interface IPiezaService {
	
	
	List<Pieza> listPiezas();
	
	Pieza savePieza(Pieza pieza);
	
	Pieza piezaPorCodigo(int codigo);
	
	Pieza updatePieza(Pieza pieza);
	
	void deletePieza(int codigo);

}