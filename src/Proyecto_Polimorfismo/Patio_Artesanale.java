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
    public static void main(String[] args) {
        Patio_KFC File = new Patio_KFC("Juan", "Ojeda", 1, 11111111, 2, 5);
        //CREO UN OBJETO CON REFERENCIA A LA CLASE PATIO_KFC, DONDE UBICO CADA UNO DE LOS DATOS CORRESPONDIENTES 
        int matriz[][] = new int[5][4];//MATRIZ EN LA CUAL LLENAREMOS LOS COMBOS TOTALES         
        try {
            Scanner FileIn = new Scanner(new File("COMBOS.csv"));//LEEMOS LA BASE DE DATOS PREVIAMENTE LLENADA
            Formatter FileOut = new Formatter("Prueba_Vota.csv");//CREAMOS EL NUEVO ARCHIVO
            for (int i = 0; i < 6; i++) {
                String contenido = FileIn.nextLine();//SIRVE PARA LEER CADA UNA DE LAS LINEAS DEL CSV
                System.out.println(contenido);//IMPRIMIMOS EL CONTENIDO DEL CSV
                String tokens[] = contenido.split(";");
                if (tokens[0].equals("COMBO1")) {
                    //EL SIGUIENTE IF SIRVE PARA COMPARAR SI LA PRIMERA CASILLA CORRESPONDE A CADA COMBO (5) EN EL CUAL PARA CADA UNO
                    //LOS VALORES DE LA BASE DE DATOS SE RESTARAN DE ACUERDO AL NUMERO DE COMBOS QUE SE DESEA PEDIR
                    if (File.pedido == 1) {
                        
                        matriz[0][0] = (Integer.parseInt(tokens[1]) < File.getNum()) ? 0 : Integer.parseInt(tokens[1]) - File.getNum();
                    } else {
                        matriz[0][0] = Integer.parseInt(tokens[1]);
                    }
                    if (File.pedido == 2) {
                        matriz[0][1] = (Integer.parseInt(tokens[2]) < File.getNum()) ? 0 : Integer.parseInt(tokens[2]) - File.getNum();
                    } else {
                        matriz[0][1] = Integer.parseInt(tokens[2]);
                    }
                    if (File.pedido == 3) {
                        matriz[0][2] = (Integer.parseInt(tokens[3]) < File.getNum()) ? 0 : Integer.parseInt(tokens[3]) - File.getNum();
                    } else {
                        matriz[0][2] = Integer.parseInt(tokens[3]);
                    }
                    if (File.pedido == 4) {
                        matriz[0][3] = (Integer.parseInt(tokens[4]) < File.getNum()) ? 0 : Integer.parseInt(tokens[4]) - File.getNum();
                    } else {
                        matriz[0][3] = Integer.parseInt(tokens[4]);
                    }

                }
                if (tokens[0].equals("COMBO2")) {
                    if (File.pedido == 1) {
//                        
                        matriz[1][0] = (Integer.parseInt(tokens[1]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[1]) - File.getNum());
                    } else {
                        matriz[1][0] = Integer.parseInt(tokens[1]);
                    }
                    if (File.pedido == 2) {
                        matriz[1][1] = (Integer.parseInt(tokens[2]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[2]) - File.getNum());
                    } else {
                        matriz[1][1] = Integer.parseInt(tokens[2]);
                    }
                    if (File.pedido == 3) {
                        matriz[1][2] = (Integer.parseInt(tokens[3]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[3]) - File.getNum());
                    } else {
                        matriz[1][2] = Integer.parseInt(tokens[3]);
                    }
                    if (File.pedido == 4) {
                        matriz[1][3] = (Integer.parseInt(tokens[4]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[4]) - File.getNum());
                    } else {
                        matriz[1][3] = Integer.parseInt(tokens[4]);
                    }
                }
                if (tokens[0].equals("COMBO3")) {
                    if (File.pedido == 1) {
                        matriz[2][0] = (Integer.parseInt(tokens[1]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[1]) - File.getNum());
                    } else {
                        matriz[2][0] = Integer.parseInt(tokens[1]);
                    }
                    if (File.pedido == 2) {
                        matriz[2][1] = (Integer.parseInt(tokens[2]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[2]) - File.getNum());
                    } else {
                        matriz[2][1] = Integer.parseInt(tokens[2]);
                    }
                    if (File.pedido == 3) {
                        matriz[2][2] = (Integer.parseInt(tokens[3]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[3]) - File.getNum());
                    } else {
                        matriz[2][2] = Integer.parseInt(tokens[3]);
                    }
                    if (File.pedido == 4) {
                        matriz[2][3] = (Integer.parseInt(tokens[4]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[4]) - File.getNum());
                    } else {
                        matriz[2][3] = Integer.parseInt(tokens[4]);
                    }
                }
                if (tokens[0].equals("COMBO4")) {
                    if (File.pedido == 1) {
                        matriz[3][0] = (Integer.parseInt(tokens[1]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[1]) - File.getNum());
                    } else {
                        matriz[3][0] = Integer.parseInt(tokens[1]);
                    }
                    if (File.pedido == 2) {
                        matriz[3][1] = (Integer.parseInt(tokens[2]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[2]) - File.getNum());
                    } else {
                        matriz[3][1] = Integer.parseInt(tokens[2]);
                    }
                    if (File.pedido == 3) {
                        matriz[3][2] = (Integer.parseInt(tokens[3]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[3]) - File.getNum());
                    } else {
                        matriz[3][2] = Integer.parseInt(tokens[3]);
                    }
                    if (File.pedido == 4) {
                        matriz[3][3] = (Integer.parseInt(tokens[4]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[4]) - File.getNum());
                    } else {
                        matriz[3][3] = Integer.parseInt(tokens[4]);
                    }
                }
                if (tokens[0].equals("COMBO5")) {
                    if (File.pedido == 1) {
                        matriz[4][0] = (Integer.parseInt(tokens[1]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[1]) - File.getNum());
                    } else {
                        matriz[4][0] = Integer.parseInt(tokens[1]);
                    }
                    if (File.pedido == 2) {
                        matriz[4][1] = (Integer.parseInt(tokens[2]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[2]) - File.getNum());
                    } else {
                        matriz[4][1] = Integer.parseInt(tokens[2]);
                    }
                    if (File.pedido == 3) {
                        matriz[4][2] = (Integer.parseInt(tokens[3]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[3]) - File.getNum());
                    } else {
                        matriz[4][2] = Integer.parseInt(tokens[3]);
                    }
                    if (File.pedido == 4) {
                        matriz[4][3] = (Integer.parseInt(tokens[4]) < File.getNum()) ? 0 : (Integer.parseInt(tokens[4]) - File.getNum());
                    } else {
                        matriz[4][3] = Integer.parseInt(tokens[4]);
                    }
                }
            }
            FileOut.format("%s;%s;%s;%s;%s;", "COMBOS", "KFC", "FOGON", "TROPI", "ARTESANALE");
            FileOut.format("\r\n");
            for (int i = 0; i < matriz.length; i++) {
                FileOut.format("%s;%d;%d;%d;%d;", "COMBO [" + (i + 1) + "]", matriz[i][0], matriz[i][1], matriz[i][2],
                        matriz[i][3]);
                FileOut.format("\r\n");
            }
            FileOut.format("\r\n\t");
            FileOut.format("%s\r\n;%s;%s\r\n;%s;%s\r\n;%s;%d\r\n;%s;%d\r\n;%s;%d\r\n;%s;%.2f;%s;%d;%s;%.2f;%s;%.2f\r\n;%s\r\n;%s\r\n;", "FACTURA ELECTRONICA",
                    "NOMBRE: ", File.Nombre, "APELLIDO: ",
                    File.Apellido, "CEDULA: ", File.cedula,
                    "NUMERO DE MESA: ", File.mesa, "COMBO: ", File.getPedido(), "PRECIO COMIDA + IVA = $", File.precioComida, "X", File.getNum(),
                    " + ", File.iva, " = $", File.total, "GRACIAS POR VISITARNOS", "//////////////////////////////////////////////////");
            FileOut.close();
        } catch (Exception e) {
        }
    }

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
                + "MESA: "+mesa+ "\n"
                + "COMBO: " + getPedido() + "\n"
                + "PEDIDO(S): " + getNum() + "\n"
                + "PRECIO COMIDA + IVA: $" + precioComida + " X " + getNum() + " + " + iva + " = $" + total + "\n"
                //mostramos el preico unitario de la comida, el numero de pedids + el iva y finalmente el total a pagar
                + "/////////////////////////////////////////////////////////\n"
                + "\tGRACIAS POR VISITARNOS\n");
    }

}
