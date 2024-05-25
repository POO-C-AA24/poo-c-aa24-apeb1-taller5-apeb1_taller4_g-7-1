class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int diferenciaEnDias(Fecha otraFecha) {
        // Método simple para calcular diferencia en días sin tener en cuenta la cantidad exacta de días en cada mes.
        int totalDias1 = this.anio * 365 + this.mes * 30 + this.dia;
        int totalDias2 = otraFecha.anio * 365 + otraFecha.mes * 30 + otraFecha.dia;
        return Math.abs(totalDias1 - totalDias2);
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
