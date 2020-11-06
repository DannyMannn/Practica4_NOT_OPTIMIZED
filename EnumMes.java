public enum  EnumMes {
    ENERO(1,"Enero"),
    FEBRERO(2,"Febrero"),
    MARZO(3,"Marzo"),
    ABRIL(4,"Abril"),
    MAYO(5,"Mayo"),
    JUNIO(6,"Junio"),
    JULIO(7,"Julio"),
    AGOSTO(8,"Agosto"),
    SEPTIEMBRE(9,"Septiembre"),
    OCTUBRE(10,"Octubre"),
    NOVIEMBRE(11,"Noviembre"),
    DICIEMBRE(12,"Diciembre");

    private final int id;
    private final String nombre;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    private EnumMes(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}
