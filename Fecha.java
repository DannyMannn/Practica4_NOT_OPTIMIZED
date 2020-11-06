import java.util.ArrayList;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(){}
    public Fecha(int dia,int mes,int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public static Fecha formatearFecha(String fecha){
        ArrayList<String> datos = BetterTextFileExample.seperateWords(fecha);
        Fecha fechaFormateada = null;
        try {
            int dia = Integer.parseInt(datos.get(0));
            int mes = EnumMes.valueOf(datos.get(1)).getId();
            int año = Integer.parseInt(datos.get(2));
            //hacer funcion para validar fecha
            return fechaFormateada = new Fecha(dia,mes,año);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            fechaFormateada = new Fecha(00,00,00);
        }
        return fechaFormateada;
    }

    public void mostrarFecha(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.año);
    }
}
