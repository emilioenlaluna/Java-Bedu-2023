package main;

public class TestConexion {
    public static void main(String[] args) {
/*
        Conexion conexion=null;
      try {
          conexion=new Conexion();
          conexion.leerDatos();

      }catch (IllegalStateException e){
          e.printStackTrace();
      }finally {
          if(conexion!=null){
              conexion.cerrar();
          }
      }

 */

        try(Conexion conexion= new Conexion()){
            conexion.leerDatos();
        }catch (Exception c){

        }
    }

}
