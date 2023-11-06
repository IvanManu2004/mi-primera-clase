public class ordenador {
    //Nombre del Microprocesador
    private String procesador;
    //Cantidad de memoria RAM
    private int ram;
    //Tiene o no refrigeracion Liquida
    private boolean refrigeracionLiquida;
    
    public ordenador(String setProcesador, int setRam) {
        procesador = setProcesador;
        ram = setRam;
        refrigeracionLiquida = false;
    }
    
    public String getProcesador() {
        return procesador;
    }
    
    public int getMemoriaRam() {
        return ram;
    }
    
    public boolean getRefrigeracion() {
        return refrigeracionLiquida;
    }
    
    public void setProcesador(String nuevoProcesador) {
        procesador = nuevoProcesador;
    }
    
    public void setRam(int nuevaRam) {
        ram = nuevaRam;
    }
    
    public void alternarRefrigeracion() {
        if (refrigeracionLiquida == false) {
            refrigeracionLiquida = true;
        }
        else {
            refrigeracionLiquida = false;
        }
    }
    
    public void imprimirDetalles() {
        System.out.println("Procesador: " + procesador + " | Memoria RAM: " + ram + "gb | Refrigeracion Liquida: " + refrigeracionLiquida);
    }
    
    public String getEstado() {
        return "Procesador: " + procesador + " | RAM: " + ram + " | Refrigeración líquida: " + refrigeracionLiquida;
    }
}