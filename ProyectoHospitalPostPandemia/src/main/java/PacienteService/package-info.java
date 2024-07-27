package com.example.proyectohospitalpostpandemia.service;

import com.example.proyectohospitalpostpandemia.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {
    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Juan", "Pérez", 30));
        pacientes.add(new Paciente("Ana", "Gómez", 25));
        pacientes.add(new Paciente("Luis", "Rodríguez", 45));
        return pacientes;
    }
}
