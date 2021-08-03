package com.briantggr.service;

import java.util.List;

import com.briantggr.model.Perfil;

public interface IntPerfilesService {
	public List<Perfil> obtenerTodas();
	public void guardar (Perfil perfil);
	public void eliminar(Integer idPerfil);
	public Perfil buscarPorId(Integer idPerfil);

}
