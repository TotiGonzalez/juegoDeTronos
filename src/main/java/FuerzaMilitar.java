import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_fuerza")
public abstract class FuerzaMilitar {

  @Id
  @GeneratedValue
  private Long id;

  public abstract void atacarA(Lugar lugar);
}
