package LocalDateLocalTime;

//import java.time.LocalTime;
import java.time.Month;

public class LocalDate {

    public static void main(String[] args) {
//        Un LocalDate representa una fecha en formato ISO(yyyy-MM-dd) sin tiempo
        LocalDate date = LocalDate.now();// fecha del momento de su creacion
        LocalDate date2 = LocalDate.of(2022, Month.APRIL, 26);//fecha definida por el usuario 
        LocalDate date3 = LocalDate.parse("1978-04-26");//otra manera para definir la fecha por el usuario
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);

//      Operaciones que se pueden realizar con LocalDate
//      Manipulaciom de fechas
        LocalDate date4 = LocalDate.parse("1978-04-26");// fecha inicial
        LocalDate newDate = date4.plusDays(10);// fecha inicial mas 10 dias (sin importar el cambio de mes y la cantidad de dias de ese mes
        LocalDate newDate2 = date4.plusMonths(3);// fecha inicial más tres meses
        /*
        Recordemos que cuando hacemos operaciones sobre las fechas debemos asignar la respuesta a una nueva 
        referencia ya que el objeto original no se modificará puesto que los objetos LocalDate son immutables.
         */
        System.out.println(date4);
        System.out.println(newDate);
        System.out.println(newDate2);

//        Comparacion entre fechas
//        Validar si una fecha es antes que otra:
        System.out.println(LocalDate.parse("1978-04-26").isBefore(date));
        System.out.println(LocalDate.now().plusYears(2).isLeapYear());
        System.out.println(LocalDate.parse("1978-04-26").getDayOfWeek());

//        LocalTime
//        LocalTime representa una hora sin la fecha, del mismo modo que con LocalDate podemos crearlo 
//      haciendo uso de los metodos now(), parse() y of(), veamos unos ejemplos
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.parse("11:00:59.759");
        LocalTime time3 = LocalTime.of(11, 00, 59) ;
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
        LocalTime time4 = time.plusHours(1);
        System.out.println(time4);
        System.out.println(time.isBefore(time4));
        
        
    }
}
