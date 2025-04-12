package programacionOrientadaAObjetos;

public class Automovil extends Vehiculo {
    private double kilometraje;       
    private boolean tieneAireAcondicionado;

    public Automovil(String marca, String modelo, int anio, double kilometraje, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio); 
        this.kilometraje = kilometraje;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public double calcularCostoMantenimiento() {
        double costo = 100 + (kilometraje * 0.05);  
        if (tieneAireAcondicionado) {
            costo += 50; 
        }
        return costo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
}
