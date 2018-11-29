/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Polimorfismo;

/**
 *
 * @author Jorge
 */
public class Patio_Artesanale extends Patio {
    //heredamos de la clase principal "Patio"

    public Patio_Artesanale(String Nombre, String Apellido, int mesa, int cedula, int pedido, int num) {
        //constructor con parametros del constructor principal
        super(Nombre, Apellido, mesa, cedula, pedido, num);
        //llamamos al constructor de la clase principal
    }

    public int getNum() {
        //metodo de la subclase para retornar el numero de pedidos quiere hacer el usuario de un combo
        return num;
    }

    public int getPedido() {
        //metodo de la subclase en el cual para cada tipo de combo se le asigna un valor diferente
        switch (pedido) {
            case 1:
                
                total = (3.00 * getNum()) + iva;
                precioComida = (total - iva) / num;
                break;
            case 2:
                
                total = (4.50 * getNum()) + iva;
                precioComida = (total - iva) / num;
                break;
            case 3:
                
                total = (10.00 * getNum()) + iva;
                precioComida = (total - iva) / num;
                break;
            case 4:
                
                total = (9.50 * getNum()) + iva;
                precioComida = (total - iva) / num;
                break;
        }
        return pedido;
    }

    @Override
    public double total() {
        //llamamos al metodo abstracto de la clase principal llamado "total"
        total = precioComida + iva;
        return total;
    }

    @Override
    public double precioComida() {
        //llamamos al metodo abstracto de la clase principal llamado "precioComida"
        precioComida = (total - iva) / num;
        return precioComida;
    }

    @Override
    public String toString() {
        precioComida();
        total();
        return ("\n\t///////////////////////////////////////////////////////////\n"
                + "\n\tBIENVENIDO AL CENTRO DE COMIDA DE SUPERMAXI LA PRADERA\n"
                //mensaje de bienvenida
                + "INGRESE SU NOMBRE Y APELLIDO\n"
                + "NOMBRE: " + Nombre + "\n" //ingresa su nombre
                + "APELLIDO: " + Apellido + "\n" //ingresa su apellido
                + "INGRESE SU NUMERO DE CEDULA: " + cedula + "\n" //ingresa numero de cedula
                + "SELECCIONE SU NUMERO DE MESA: " + mesa + "\n" //ingresa la mesa en la cual se encuentra
                + "////////////////////////////////////////////////////////////\n"
                + "SELECCIONE EL LOCAL EN EL CUAL QUIERE HACER SU PEDIDO\n" //seleccion del patio de comida
                + "1. KFC\n"
                + "2. TROPI BURGUER\n"
                + "3. FOGON GRILL\n"
                + "4. ARTESANALE\n"
                + "OPCION: 4\n"
                + "///////////////////////////////////////////////////////\n"
                + "USTED HA ESCOGIDO ARTESANALE\n"
                + "A CONTINUACION ESCOJA SU PEDIDO DEL SIGUIENTE MENU\n"
                + "1. COMBO 1 (PIZZA 4 PORCIONES + COLA)---> $3.00\n"
                + "2. COMBO 2 (PIZZA 8 PORCIONES + COLA)---> $4.50\n"
                + "3. COMBO 3 (PIZZA FAMILIAR + COLA + 6 ALITAS )---> $10.00\n"
                + "4. COMBO 4 (PIZZA MEDIANA + COLA + ALITAS + YOGURT CASERO--->9.75\n"
                + "OPCION: " + getPedido() + "\n" 
                //llamamos al metodo getPedido el cual tiene la funcion de calcular el precio de la comida y el total        
                + "USTED HA ESCOGIDO EL COMBO " + getPedido() + "\n"
                + "¿CUÁNTOS PEDIDOS DE ESTE COMBO DESEA REALIZAR?\n" + getNum() + "\n"
                //llamamos a getNum el cual retorna el numero de pedidos que hace el usuario        
                + "EL VALOR TOTAL A PAGAR ES DE $" + total + "\n"
                //mensaje que indica el total a pagar
                + "//////////////////////////////////////////////\n"
                + "\tFACTURA ELECTRONICA\n"
                + "NOMBRE: " + Nombre + "\n"
                + "APELLIDO: " + Apellido + "\n"
                + "CEDULA: " + cedula + "\n"
                + "COMBO: " + getPedido() + "\n"
                + "PEDIDO(S): " + getNum() + "\n"
                + "PRECIO COMIDA + IVA: $" + precioComida + " X " + getNum() + " + " + iva + " = $" + total + "\n"
                //mostramos el preico unitario de la comida, el numero de pedids + el iva y finalmente el total a pagar
                + "/////////////////////////////////////////////////////////\n"
                + "\tGRACIAS POR VISITARNOS\n");
    }

}
