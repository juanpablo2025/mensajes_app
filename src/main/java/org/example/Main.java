package org.example;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int option =0;

    do{
        System.out.println("-----------------");
        System.out.println(" Aplicacion de mensajes");
        System.out.println(" 1. crear mensaje");
        System.out.println(" 2. listar mensajes");
        System.out.println(" 3. eliminar mensaje");
        System.out.println(" 4. editar mensaje");
        System.out.println(" 5. salir");
         option=sc.nextInt();

        switch (option){
            case 1:
                MessagesService.CreateMessage();
                break;
            case 2:
                MessagesService.ToListMessages();
                break;
            case 3:
                MessagesService.DeleteMessages();
                break;
            case 4:
                MessagesService.EditMessages();
                break;
            default:
                break;
        }

    }while(option != 5);


}

}
