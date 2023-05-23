package Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


  public static void main(String[] args) throws ParseException {

    Date someDate = new Date();

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    System.out.println(format.format(someDate));

    Date parsedDate = format.parse("5.2.1990");
    System.out.println(parsedDate);
    System.out.println(someDate.getTime());

    Date someDate1 = new Date();

    SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
    System.out.println(format1.format(someDate));

    Date parsedDate1 = format.parse("10.2.2000");
    System.out.println(parsedDate1);
    System.out.println(someDate1.getTime());


  }

}
