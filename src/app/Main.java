package app;

import model.Direccion;
import model.Persona;
import model.GuiaTuristico;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion(
                "Los Alerces 123",
                "Llanquihue",
                "Los Lagos"
        );

        Persona persona1 = new Persona(
                "12.345.678-9",
                "Juan Perez",
                "9 8765 4321",
                direccion1
        );

        Direccion direccion2 = new Direccion(
                "Av. Costanera 456",
                "Puerto Varas",
                "Los Lagos"
        );

        GuiaTuristico guiaTuristico1 = new GuiaTuristico(
                "21.661.160-8",
                "Anita Páez",
                "9 1234 5678",
                direccion2,
                "Turismo Cultural"
        );

        Direccion direccion3 = new Direccion(
                "Ruta 5 sur 789",
                "Frutillar",
                "Los Lagos"
        );

        GuiaTuristico guiaTuristico2 = new GuiaTuristico(
                "22.222.222-2",
                "Pedro Gonzalez",
                "9 2345 6781",
                direccion3,
                "Turismo Gastronomico"
        );

        System.out.println("=== PERSONA ===");
        System.out.println(persona1);

        System.out.println("\n=== GUÍA TURÍSTICO 1 ===");
        System.out.println(guiaTuristico1);

        System.out.println("\n=== GUÍA TURÍSTICO 2 ===");
        System.out.println(guiaTuristico2);
    }
}
