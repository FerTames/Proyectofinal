package com.lacangreburger.view;
import java.sql.SQLException;
import java.util.Scanner;

import com.lacangreburger.Menu.MenuCliente;
import com.lacangreburger.control.Conexion;
import com.lacangreburger.entity.Cliente;

public class Pantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conexion conexion = new Conexion();
		
		EmpleadoView empleado = new EmpleadoView(conexion,scanner);
		empleado.InsertarEmpleado();
		ClienteView cliente = new ClienteView(conexion , scanner);
		cliente.InsertarCliente();
		MenuCliente.menu(scanner, cliente.getCliente());
		
		try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
		
		
		scanner.close();
	}

	
	
}

