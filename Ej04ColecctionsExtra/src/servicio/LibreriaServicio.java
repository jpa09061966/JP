/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.CiudadPostal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jorge
 */
public class LibreriaServicio {
    private Map<String, CiudadPostal> codigosPostales = new HashMap<>();

    public void agregarCodigoPostal(String codigoPostal, String ciudad) {
        codigosPostales.put(codigoPostal, new CiudadPostal(codigoPostal, ciudad));
    }

    public void eliminarCodigoPostal(String codigoPostal) {
        codigosPostales.remove(codigoPostal);
    }

    public CiudadPostal obtenerCiudadPostal(String codigoPostal) {
        return codigosPostales.get(codigoPostal);
    }

    public List<CiudadPostal> obtenerTodosLosCodigosPostalesOrdenados() {
        List<CiudadPostal> listaCodigosPostales = new ArrayList<>(codigosPostales.values());
        Collections.sort(listaCodigosPostales, Comparator.comparing(CiudadPostal::getCodigoPostal));
        return listaCodigosPostales;
    }
}


