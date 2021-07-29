package com.briantggr.service;

import java.util.List;

import com.briantggr.model.Vacante;

public interface IntVacantesServices {
	
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vacante);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	
	public List<Vacante> obtenerDestacadas();
	public Integer totalEntidades();

}
