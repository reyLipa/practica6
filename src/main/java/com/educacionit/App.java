package com.educacionit;

import conexion.Conexion;
import dao.ProductoDAO;
import modelos.Producto;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Conexion con=new Conexion();
        con.conectar();
        ProductoDAO productoDAO=new ProductoDAO();
        productoDAO.crear(new Producto("Lacteos", 12, 100f));
        productoDAO.crear(new Producto("cereales", 15, 1002f));
        productoDAO.crear(new Producto("aceites", 10, 1000f));

        System.out.println(productoDAO.listar());

    }
}
