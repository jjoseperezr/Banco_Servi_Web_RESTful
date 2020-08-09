package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "solicitudes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "solicitudes.findAll", query = "SELECT s FROM solicitudes s")
    , @NamedQuery(name = "solicitudes.findById", query = "SELECT s FROM solicitudes s WHERE s.id = :id")
    , @NamedQuery(name = "solicitudes.findByNombre", query = "SELECT s FROM solicitudes s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "solicitudes.findByCorreo", query = "SELECT s FROM solicitudes s WHERE s.correo = :correo")
    , @NamedQuery(name = "solicitudes.findByFechanacimiento", query = "SELECT s FROM solicitudes s WHERE s.fechanacimiento = :fechanacimiento")
    , @NamedQuery(name = "solicitudes.findByEstadosolicitu", query = "SELECT s FROM solicitudes s WHERE s.estadosolicitud = :estadosolicitud")
    , @NamedQuery(name = "solicitudes.findByOrigentramite", query = "SELECT s FROM solicitudes s WHERE s.origentramite = :origentramite")
    , @NamedQuery(name = "solicitudes.findByCedula", query = "SELECT s FROM solicitudes s WHERE s.cedula = :cedula")})
public class solicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "estadosolicitud")
    private String estadosolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "origentramite")
    private String origentramite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula")
    private int cedula;

    public solicitudes() {
    }

    public solicitudes(Integer id) {
        this.id = id;
    }

    public solicitudes(Integer id, String nombre, String correo, Date fechanacimiento, String estadosolicitud, String origentramite, int cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.estadosolicitud = estadosolicitud;
        this.origentramite = origentramite;
        this.cedula = cedula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEstadosolicitu() {
        return estadosolicitud;
    }

    public void setEstadosolicitu(String estadosolicitud) {
        this.estadosolicitud = estadosolicitud;
    }

    public String getOrigentramite() {
        return origentramite;
    }

    public void setOrigentramite(String origentramite) {
        this.origentramite = origentramite;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof solicitudes)) {
            return false;
        }
        solicitudes other = (solicitudes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.solicitudes[ id=" + id + " ]";
    }
    
}
