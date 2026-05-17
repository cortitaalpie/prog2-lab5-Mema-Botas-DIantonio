package org.example;

/**
 * @author gabi
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String instagram;
    private String facebook;
    
    public Cliente(){
    }
    
    
    
    //GETTERS Y SETTERS

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", direccion=" + direccion + ", instagram=" + instagram + ", facebook=" + facebook + '}';
    }
    
    //METODOS
    public Pedido realizarPedido(){
        return null;
    }
    public void verHistorialPedidos(){        
    }
}
