import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "region")
public class Region implements Fundable {
  @Id
  @GeneratedValue
  private Long id;

  private String nombre;
  @OneToMany
  private Set<Lugar> lugaresDeLaRegion = new HashSet<>();
  private int anioFundacion;

  public Region() {

  }

  public void addLugar(Lugar lugar) {
    lugaresDeLaRegion.add(lugar);
  }

  public Set<Castillo>castillos(){
    Set<Castillo>castillos = new HashSet<>();
    for (Lugar lugar : lugaresDeLaRegion) {
      if(lugar instanceof Castillo){
        castillos.add((Castillo) lugar);
      }
    }
    return castillos;
  }

  public Set<Ciudad>ciudades(){
    Set<Ciudad>ciudades = new HashSet<>();
    for (Lugar lugar : lugaresDeLaRegion) {
      if (lugar instanceof Ciudad){
        ciudades.add((Ciudad) lugar);
      }
    }
    return ciudades;
  }

  public Integer poblacionTotal(){
    Integer poblacionTotal = 0;
    for (Lugar lugar : lugaresDeLaRegion) {
      poblacionTotal += lugar.getPoblacion();
    }
    return poblacionTotal;
  }

  @Override
  public int anioFundacion() {
    return anioFundacion;
  }
}
