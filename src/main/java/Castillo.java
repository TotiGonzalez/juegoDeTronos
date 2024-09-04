import javax.persistence.*;

@Entity
public class Castillo extends Lugar{
  private Integer cantidadTorres;
  private Integer cantidadMurallas;


  public Castillo(String nombre, Integer anioFundacion, Integer poblacion) {
    super(nombre, anioFundacion, poblacion);
  }

  public Castillo() {

  }
}
