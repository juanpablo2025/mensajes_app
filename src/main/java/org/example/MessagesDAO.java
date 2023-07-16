package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {

    public static void SendMessage(Messages messages){
        Conection dbConection = new Conection();

        try(Connection conection= dbConection.getConnection()){

            PreparedStatement ps = null;
            try{
                String query="INSERT INTO messages(message,messageAuthor)VALUES(?,?)";
                ps=conection.prepareStatement(query);
                ps.setString(1,messages.getMessage());
                ps.setString(2,messages.getMessageAuthor());
                ps.executeUpdate();
                System.out.println("mensaje creado");


            }catch(SQLException ex ){
                System.out.println(ex);

            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void readMessage() {
        Conection dbConection = new Conection();

        PreparedStatement ps=null;
        ResultSet rs= null;

        try(Connection connection = dbConection.getConnection()){
            String query ="SELECT * FROM messages";
            ps=connection.prepareStatement(query);
            rs=ps.executeQuery();

            while(rs.next()){
                System.out.println("ID"+rs.getInt("idMessage"));
                System.out.println("Message:"+rs.getString("message"));
                System.out.println("Author"+rs.getString("messageAutor"));
                System.out.println("Date"+rs.getString("messageDate"));
                System.out.println("");
            }

        }catch (SQLException e){
            System.out.println("No se pudiera recuperar los mensajes");
            System.out.println(e);
        }


    }

    public static void DeleteMessage(){


    }
}
