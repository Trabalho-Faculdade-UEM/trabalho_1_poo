/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author MatheusConsoni
 */
public class Consulta {
    private enum Tipo{
        NORMAL,
        RETORNO
    };
    
    //Atributos
    private int id; //gerar id
    private LocalDate data;
    private LocalTime horario;
    private int medicoId;
    private int pacienteId;
    private Tipo tipo;
    
    //Construtor
    public Consulta(LocalDate data, LocalTime horario) {
        this.data = data;
        this.horario = horario;
    }
    
    //Gets e Sets
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setMedicoId(Medico medico){
        this.medicoId = medico.getCrm();
    }
    
    public int getMedicoId(){
        return medicoId;
    }

    public void setPacienteId(Paciente paciente){
        this.pacienteId = paciente.getId();
    }
    
    public int getPacienteId(){
        return pacienteId;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == Tipo.NORMAL.name()){
            this.tipo = Tipo.NORMAL;
        } else {
            this.tipo = Tipo.RETORNO;
        }
    }
   
}