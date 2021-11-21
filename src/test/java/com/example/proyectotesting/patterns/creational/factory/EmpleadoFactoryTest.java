package com.example.proyectotesting.patterns.creational.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoFactoryTest {

    EmpleadoFactory empleadoFactory;

    @BeforeEach
    void setUp() {
        empleadoFactory = new EmpleadoFactory();
    }

    @Test
    void getEmpleadoMECANICOTest() {

        EmpleadoType empleadoType = EmpleadoType.valueOf("MECANICO");

        EmpleadoFactory empleadofactory = new EmpleadoFactory();
        empleadofactory.getEmpleado(empleadoType);

    }

    @Test
    void getEmpleadoPROGRAMADORTest() {

        EmpleadoFactory empleadofactory = new EmpleadoFactory();

        Empleado empleado1 = empleadofactory.getEmpleado(EmpleadoType.PROGRAMADOR);

    }
@Disabled
    @Test
    void getEmpleadoIllegalArgumentExceptionTest() {
        EmpleadoType empleadoType = EmpleadoType.valueOf("OTRO");

        EmpleadoFactory empleadofactory = new EmpleadoFactory();
        empleadofactory.getEmpleado(empleadoType);

        assertThrows(
                IllegalArgumentException.class,
                () -> empleadofactory.getEmpleado(EmpleadoType.valueOf("OTRO"))
        );
    }
}