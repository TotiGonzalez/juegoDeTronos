import javax.persistence.*;
@Entity
@DiscriminatorValue("NAVAL")

public class Naval extends FuerzaMilitar{
  private int cantidadBarcos;

  @Override
  public void atacarA(Lugar lugar) {

  }
}
