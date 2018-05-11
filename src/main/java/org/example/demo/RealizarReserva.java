
package org.example.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nroReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="habitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nroHabitaciones" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidadPersonas" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="estadoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residentes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="persona" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nroReserva",
    "habitacion",
    "hotel",
    "fechaReserva",
    "fechaIngreso",
    "nroHabitaciones",
    "tipoHabitacion",
    "cantidadPersonas",
    "estadoReserva",
    "residentes"
})
@XmlRootElement(name = "realizarReserva")
public class RealizarReserva {

    protected String nroReserva;
    protected String habitacion;
    protected String hotel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaReserva;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngreso;
    protected BigInteger nroHabitaciones;
    protected String tipoHabitacion;
    protected BigInteger cantidadPersonas;
    protected String estadoReserva;
    protected RealizarReserva.Residentes residentes;

    /**
     * Obtiene el valor de la propiedad nroReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroReserva() {
        return nroReserva;
    }

    /**
     * Define el valor de la propiedad nroReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroReserva(String value) {
        this.nroReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad habitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitacion() {
        return habitacion;
    }

    /**
     * Define el valor de la propiedad habitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitacion(String value) {
        this.habitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad hotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * Define el valor de la propiedad hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotel(String value) {
        this.hotel = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Define el valor de la propiedad fechaReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaReserva(XMLGregorianCalendar value) {
        this.fechaReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngreso(XMLGregorianCalendar value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad nroHabitaciones.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNroHabitaciones() {
        return nroHabitaciones;
    }

    /**
     * Define el valor de la propiedad nroHabitaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNroHabitaciones(BigInteger value) {
        this.nroHabitaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHabitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Define el valor de la propiedad tipoHabitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHabitacion(String value) {
        this.tipoHabitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPersonas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadPersonas() {
        return cantidadPersonas;
    }

    /**
     * Define el valor de la propiedad cantidadPersonas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadPersonas(BigInteger value) {
        this.cantidadPersonas = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoReserva() {
        return estadoReserva;
    }

    /**
     * Define el valor de la propiedad estadoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoReserva(String value) {
        this.estadoReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad residentes.
     * 
     * @return
     *     possible object is
     *     {@link RealizarReserva.Residentes }
     *     
     */
    public RealizarReserva.Residentes getResidentes() {
        return residentes;
    }

    /**
     * Define el valor de la propiedad residentes.
     * 
     * @param value
     *     allowed object is
     *     {@link RealizarReserva.Residentes }
     *     
     */
    public void setResidentes(RealizarReserva.Residentes value) {
        this.residentes = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="persona" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="nroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "persona"
    })
    public static class Residentes {

        @XmlElement(required = true)
        protected List<RealizarReserva.Residentes.Persona> persona;

        /**
         * Gets the value of the persona property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the persona property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersona().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RealizarReserva.Residentes.Persona }
         * 
         * 
         */
        public List<RealizarReserva.Residentes.Persona> getPersona() {
            if (persona == null) {
                persona = new ArrayList<RealizarReserva.Residentes.Persona>();
            }
            return this.persona;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="nroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nombre",
            "apellido",
            "genero",
            "titular",
            "nroIdentificacion",
            "tipoIdentificacion"
        })
        public static class Persona {

            protected String nombre;
            protected String apellido;
            protected String genero;
            protected String titular;
            protected String nroIdentificacion;
            protected String tipoIdentificacion;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad apellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApellido() {
                return apellido;
            }

            /**
             * Define el valor de la propiedad apellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApellido(String value) {
                this.apellido = value;
            }

            /**
             * Obtiene el valor de la propiedad genero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGenero() {
                return genero;
            }

            /**
             * Define el valor de la propiedad genero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGenero(String value) {
                this.genero = value;
            }

            /**
             * Obtiene el valor de la propiedad titular.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitular() {
                return titular;
            }

            /**
             * Define el valor de la propiedad titular.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitular(String value) {
                this.titular = value;
            }

            /**
             * Obtiene el valor de la propiedad nroIdentificacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNroIdentificacion() {
                return nroIdentificacion;
            }

            /**
             * Define el valor de la propiedad nroIdentificacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNroIdentificacion(String value) {
                this.nroIdentificacion = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoIdentificacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoIdentificacion() {
                return tipoIdentificacion;
            }

            /**
             * Define el valor de la propiedad tipoIdentificacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoIdentificacion(String value) {
                this.tipoIdentificacion = value;
            }

        }

    }

}
