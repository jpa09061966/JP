
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class CiudadPostal {
    private String codigoPostal;
    private String ciudad;

    public CiudadPostal(String codigoPostal, String ciudad) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Código Postal: " + codigoPostal + ", Ciudad: " + ciudad;
    }
}
