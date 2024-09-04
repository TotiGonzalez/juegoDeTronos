import javax.persistence.*;
@Entity
public class Casa implements Fundable{
  private String nombre;
  private int patrimonio;
  private int anioFundacion;
  @ManyToOne
  private Lugar lugarOrigen;
  @Id
  private Long id;

  public String nombreLugarOrigen(){
    return lugarOrigen.getNombre();
  }

  @Override
  public int anioFundacion() {
    return anioFundacion;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
