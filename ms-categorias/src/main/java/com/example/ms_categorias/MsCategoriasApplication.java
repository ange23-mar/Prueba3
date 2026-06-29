package com.example.ms_categorias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsCategoriasApplication {
public static void main(String[] args) {
      System.setProperty("TNS_ADMIN_PATH", "C:/Users/Usuario/Desktop/prueba3FullStrack/ms-proveedores/src/main/resources/Wallet");
      SpringApplication.run(MsCategoriasApplication.class, args);

}
}
