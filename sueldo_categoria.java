import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      int numdias=1,hordia,hortotal=0,categoria;
      float sueldo,porc;
      String nombre;
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese el nombre del empleado: ");
      nombre=leer.next();
      System.out.println("Ingrese el sueldo de "+nombre+": ");
      sueldo=leer.nextFloat();
      System.out.println("Ingrese la categoria del sueldo: ");
      categoria=leer.nextInt();
      switch (categoria) {
          case 1:
            porc=0.15;
            sueldo=sueldo+(sueldo*porc);             
          break;
          case 2:
            porc=0.10;
            sueldo=sueldo+(sueldo*porc);
          break;
          case 3:
            porc=0.08;
            sueldo=sueldo+(sueldo*porc);
          break;
          case 4:
            porc=0.07;
            sueldo=sueldo+(sueldo*porc);
          break;
          default:
            System.out.println("Categoria incorrecta");
           break;
      }
      while (numdias<=5) {
          System.out.println("Ingrese el # de horas trabajadas el dia "+numdias+": ");
          hordia=leer.nextInt();
          hortotal=hordia+hortotal;
          numdias++;
      }
      System.out.println("Horas trabajadas en la semana: "+hortotal);
      System.out.println("Sueldo pagado a "+nombre+" en la semana: "+(sueldo*hortotal)+"$");
      System.out.println("La categoria del sueldo es: "+categoria+" por lo que se incrementa un: "+(porc*100));

    }
  }