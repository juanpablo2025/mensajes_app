package org.example;

import java.util.Scanner;

public class MessagesService {


    public static void CreateMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un mensaje");
        String message = sc.nextLine();

        System.out.println("tu nombre");
        String name = sc.nextLine();

        Messages registry = new Messages();
        registry.setMessage(message);
        registry.setMessageAuthor(name);
        MessagesDAO.SendMessage(registry);




    }

    public static void ToListMessages() {

        MessagesDAO.readMessage();

    }

    public static void DeleteMessages() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id dek mensaje que quieres borrar");
        int idMessage=sc.nextInt();
        MessagesDAO.DeleteMessage(idMessage);
    }



}
