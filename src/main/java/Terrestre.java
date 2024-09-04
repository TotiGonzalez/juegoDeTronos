import javax.persistence.*;
@Entity
@DiscriminatorValue("TERRESTRE")
public class Terrestre extends  FuerzaMilitar {
  private int cantidadSoldados;

  @Override
  public void atacarA(Lugar lugar) {

  }
}
