package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Proveedor;

public interface ProveedorDAO extends JpaRepository<Proveedor, String>{
	
}
