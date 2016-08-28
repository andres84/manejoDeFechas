package fechas;

import java.util.Calendar;
import java.util.Date;

public class Fechas {

    public static void main(String[] args) {

        //utilizar la clase Date
        Date fecha = new Date();
        int anio = fecha.getYear();//metodo subrayado esta obsoleto
        System.out.println(anio + 1900);
        int dia = fecha.getDate();//metodo subrayado esta obsoleto
        System.out.println(dia);
        
        //utilizar la clase calendar recomendada para apps actuales
        Calendar calendario = Calendar.getInstance();
        int anio2 = calendario.get(Calendar.YEAR);
        System.out.println(anio2);
        
    }
    
}
