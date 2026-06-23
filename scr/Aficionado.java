import java.util.ArrayList;

public class Aficionado extends Usuario {

    private String celular;
    private String paisFavorito;

    public Aficionado(String codigoUnico,
                      String cedula,
                      String nombres,
                      String apellidos,
                      String usuario,
                      String contraseña,
                      String correo,
                      String celular,
                      String paisFavorito) {

        super(
                codigoUnico,
                cedula,
                nombres,
                apellidos,
                usuario,
                contraseña,
                correo,
                RolUsuario.AFICIONADO
        );

        this.celular = celular;
        this.paisFavorito = paisFavorito;
    }

  


