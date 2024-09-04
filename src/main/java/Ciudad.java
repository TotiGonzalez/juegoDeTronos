import javax.persistence.*;

@Entity
public class Ciudad extends Lugar{
  private Integer cantidadDeComercios;
  private Integer cantidadDeSantuarios;
  private Double tasaDeMortalidad;

  public Ciudad(String nombre, Integer anioFundacion, Integer poblacion) {
    super(nombre, anioFundacion, poblacion);
  }

  public Ciudad() {

  }
}
