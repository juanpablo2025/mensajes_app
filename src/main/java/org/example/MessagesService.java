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
        System.out.println("Indica el id del mensaje que quieres borrar");
        int idMessage=sc.nextInt();
        MessagesDAO.DeleteMessage(idMessage);
    }

    public static void EditMessages() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el mensaje");
        String message = sc.nextLine();

        System.out.println("indica el id");
        int idMessage = sc.nextInt();
        Messages update = new Messages();
        update.setIdMessage(idMessage);
        update.setMessage(message);
        MessagesDAO.UpdateMessages(update);

    }



}
