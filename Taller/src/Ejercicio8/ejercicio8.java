package Ejercicio8;

public class ejercicio8 {
    public int numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    public int cedulaCliente;
    private int peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int costo;

    private String estadoEnvio;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public int calcularCostoXKilo(){

        return peso*5000;

    }

    public String verificarEntrega(){

        if (estadoEnvio == ("Sent")){
            return "The shipping status is: " + estadoEnvio + " he was sent to the city: " + ciudadDestino + " by the client with ID: " + cedulaCliente + " with guide number: " + numeroGuia;
        }else{
            return "The shipping status is: " + estadoEnvio;
        }
    }
}
