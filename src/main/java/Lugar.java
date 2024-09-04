import javax.persistence.*;

@Entity
@Table(name = "lugar")
public class Lugar {

  private String nombre;
  private int anioFundacion;
  private int poblacion;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Lugar(String nombre, Integer anioFundacion, Integer poblacion) {
    this.nombre = nombre;
    this.anioFundacion = anioFundacion;
    this.poblacion = poblacion;
  }

  public Lugar() {

  }

  public Integer getPoblacion() {
    return poblacion;
  }

  public String getNombre() {
    return nombre;
  }

  public Integer getAnioFundacion() {
    return anioFundacion;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
