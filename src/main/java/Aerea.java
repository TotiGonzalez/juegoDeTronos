import javax.persistence.*;
@Entity
@DiscriminatorValue("AEREA")

public class Aerea extends FuerzaMilitar {
  private int cantidadDragones;

  @Override
  public void atacarA(Lugar lugar) {

  }
}
