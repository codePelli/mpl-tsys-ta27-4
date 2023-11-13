package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PiezaDAO;
import com.example.demo.dto.Pieza;


@Service
public class IPiezaServiceImpl implements IPiezaService{

	@Autowired
	private PiezaDAO piezaServ;
	
	@Override
	public List<Pieza> listPiezas() {
		// TODO Auto-generated method stub
		return piezaServ.findAll();
	}

	@Override
	public Pieza savePieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return piezaServ.save(pieza);
	}

	@Override
	public Pieza piezaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return piezaServ.findById(codigo).get();
	}

	@Override
	public Pieza updatePieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return piezaServ.save(pieza);
	}

	@Override
	public void deletePieza(int codigo) {
		// TODO Auto-generated method stub
		piezaServ.deleteById(codigo);
	}

}
