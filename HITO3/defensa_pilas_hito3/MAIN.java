package HITO3.defensa_pilas_hito3;

import HITO3.PilaDeLibros.Libro;
import HITO3.PilaDeLibros.PilaDeLibros;

public class MAIN {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("William Arandes", "Barra", 33, "El Alto", 62, "6778933LP");
        Estudiante est2 = new Estudiante("Robert", "Lewnadowski", 19, "Badalona", 95, "0945111PL");
        Estudiante est3 = new Estudiante("Leonel", "Messi", 16, "Buenos Aires", 50, "4854946AR");
        Estudiante est4 = new Estudiante("Alessandro", "Del Piero", 20, "La Paz", 89, "756425587LP");
        Estudiante est5 = new Estudiante("Jonathan", "Alarcon", 18, "La Paz", 98, "11542412LP");

        PilaDeEstudiantes Estudiante = new PilaDeEstudiantes(10);
        Estudiante.Adicionar(est1);
        Estudiante.Adicionar(est2);
        Estudiante.Adicionar(est3);
        Estudiante.Adicionar(est4);
        Estudiante.Adicionar(est5);

        Estudiante.Mostrar();
        NotaMayorElAlto(Estudiante, 51);
        AprobadosSedeElAlto(Estudiante);

    }

    public static void NotaMayorElAlto(PilaDeEstudiantes estudent, int NotaMayor) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(50);
        int cont = 0;

        Estudiante ValorExtraidoDePila = null;
        while (estudent.esVacio() == false) {
            ValorExtraidoDePila = estudent.eliminar();
            if (ValorExtraidoDePila.getNotaFinal() > NotaMayor && ValorExtraidoDePila.getSede() == "El Alto") {
                cont = cont + 1;
            }
            aux.Adicionar(ValorExtraidoDePila);
        }
        estudent.esVacio();

        System.out.println("\nESTUDIANTES APROBADOS DE LA SEDE DE EL ALTO: " + cont);
    }
    public static void AprobadosSedeElAlto(PilaDeEstudiantes estudent) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(50);

        Estudiante ValorExtraidoDePila = null;
        while (estudent.esVacio() == false) {
            ValorExtraidoDePila = estudent.eliminar();
            if (ValorExtraidoDePila.getNotaFinal() > 51 && ValorExtraidoDePila.getSede() == "El Alto") {
                estudent.Mostrar();
            }

            aux.Adicionar(ValorExtraidoDePila);

        }
        estudent.esVacio();
        System.out.println("\nESTUDIANTES APROBADOS DE LA SEDE DE EL ALTO: ");
    }
}

