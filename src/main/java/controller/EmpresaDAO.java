/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import models.Empresa;

import java.util.ArrayList;

/**
 *
 * @author AlejandroMarínBermúd
 */
public interface EmpresaDAO {
    
    void new_empresa(String nombre, int telefono, String email, String responsable, String observaciones);
    
    void get_info(String nombre);
    
    void up_empresa(String empresaObjetivo,String nombre, int telefono, String email, String responsable,
                    String observaciones);
    ArrayList<Empresa> getAll();
}
