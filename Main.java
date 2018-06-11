package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import sun.font.TrueTypeFont;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Contactos contacto= new Contactos();

    public static void main(String[] args){
        JFrame frameprincipal= new JFrame("Libro Contactos");
        frameprincipal.setContentPane(new Libro_contactos().panel1);
        frameprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameprincipal.pack();
        frameprincipal.setVisible(true);
    }


    public static void Objeto_Nuevo(String[] args) throws IOException {
	System.out.print("Escriba su nombre");
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	contacto.Nombre_de_Contacto=buffer.readLine();
	System.out.print(contacto.Nombre_de_Contacto);
	telefonoMovilget();
	telefonoCasaget();
	telefonoTrabajoget();
	telefonoFaxget();
	telefonoOtroget();
	correo1get();
	correo2get();
	correo3get();
	direccioncasaget();
	direcciontrabajoget();
	lugarestudioget();
	familiaget();
	profesionget();
	notasget();
	cumpleget();
	matrimonioget();
	trabajoget();
	imagenget();
	sonidocorreoget();
	sonidollamadaget();
	sonidomsjget();
	sonidosilencioget();
	CreateJson(contacto);
    }
    public static void CreateJson(Contactos contacto){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("c:\\contactos.json"), contacto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void telefonoMovilget() throws IOException {
        System.out.print("Escriba su número móvil");
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        try{
            contacto.telefonoMovil= Integer.parseInt(buffer.readLine());
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid Format!");
        }
        System.out.print(contacto.telefonoMovil);
    }
    public static void telefonoFaxget() throws IOException {
        System.out.print("Escriba el número de su Fax");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try{
            contacto.telefonoFax = Integer.parseInt(buffer.readLine());
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid Format!");
        }
        System.out.print(contacto.telefonoFax);
    }
    public static void telefonoTrabajoget() throws IOException {
        System.out.print("Escriba el número de su Trabajo");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try{
            contacto.telefonoTrabajo = Integer.parseInt(buffer.readLine());
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid Format!");
        }

        System.out.print(contacto.telefonoTrabajo);
    }
    public static void telefonoCasaget() throws IOException {
        System.out.print("Escriba el número de su Casa");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            contacto.telefonoCasa =  Integer.parseInt(buffer.readLine());
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid Format!");
        }
        System.out.print(contacto.telefonoCasa);
    }
    public static void telefonoOtroget() throws IOException {
        System.out.print("Escriba el número de su otro teléfono");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            contacto.telefonoOtro =  Integer.parseInt(buffer.readLine());
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid Format!");
        }
        System.out.print(contacto.telefonoOtro);
    }
    public static void correo1get() throws IOException {
        System.out.print("Escriba su correo eletrónico");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.correo1 = buffer.readLine();
        System.out.print(contacto.correo1);
    }
    public static void correo2get() throws IOException {
        System.out.print("Escriba su correo eletrónico");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.correo2 = buffer.readLine();
        System.out.print(contacto.correo2);
    }
    public static void correo3get() throws IOException {
        System.out.print("Escriba su correo eletrónico");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.correo3 = buffer.readLine();
        System.out.print(contacto.correo3);
    }
    public static void direccioncasaget() throws IOException {
        System.out.print("Escriba su dirreción de casa");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.direccionCasa = buffer.readLine();
        System.out.print(contacto.direccionCasa);
    }
    public static void direcciontrabajoget() throws IOException {
        System.out.print("Escriba su dirreción de trabajo");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.direccionTrabajo = buffer.readLine();
        System.out.print(contacto.direccionTrabajo);
    }
    public static void lugarestudioget() throws IOException {
        System.out.print("Escriba su lugar de estudio");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.lugarEstudio = buffer.readLine();
        System.out.print(contacto.lugarEstudio);
    }
    public static void familiaget() throws IOException {
        System.out.print("Escriba info de su familia");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.familia = buffer.readLine();
        System.out.print(contacto.familia);
    }
    public static void profesionget() throws IOException {
        System.out.print("Escriba info de su familia");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.Profesion = buffer.readLine();
        System.out.print(contacto.Profesion);
    }
    public static void notasget() throws IOException {
        System.out.print("Escriba info de su familia");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.notas = buffer.readLine();
        System.out.print(contacto.notas);
    }
    public static void matrimonioget() throws IOException {
        System.out.print("Escriba su fecha de matrimonio");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.FechaMatrimonio = buffer.readLine();
        System.out.print(contacto.FechaMatrimonio);
    }
    public static void cumpleget() throws IOException {
        System.out.print("Escriba su fecha de cumpleaños");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.FechaCumple = buffer.readLine();
        System.out.print(contacto.FechaCumple);
    }
    public static void trabajoget() throws IOException {
        System.out.print("Escriba su fecha de ingreso del trabajo");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.FechaTrabajo = buffer.readLine();
        System.out.print(contacto.FechaTrabajo);
    }
    public static void imagenget() throws IOException {
        String imagen;
        System.out.print("Elija  su imagen");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Contactos contacto = new Contactos();
        imagen = buffer.readLine();
        if (imagen.equals("Sí")){contacto.ind_imagen=true;}else{contacto.ind_imagen=false;}
        System.out.print(contacto.ind_imagen);
    }
    public static void sonidollamadaget() throws IOException {
        System.out.print("Elija  su sonido de llamada");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.sonidoLlamada = buffer.readLine();
        System.out.print(contacto.sonidoLlamada);
    }
    public static void sonidomsjget() throws IOException {
        System.out.print("Elija  su sonido de mensaje");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.sonidoMsj = buffer.readLine();
        System.out.print(contacto.sonidoMsj);
    }
    public static void sonidocorreoget() throws IOException {
        System.out.print("Elija  su sonido de correo");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.sonidoCorreo = buffer.readLine();
        System.out.print(contacto.sonidoCorreo);
    }
    public static void sonidosilencioget() throws IOException {
        System.out.print("Elija  su sonido de silencio");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        contacto.sonidoSilencio = buffer.readLine();
        System.out.print(contacto.sonidoSilencio);
    }
}
