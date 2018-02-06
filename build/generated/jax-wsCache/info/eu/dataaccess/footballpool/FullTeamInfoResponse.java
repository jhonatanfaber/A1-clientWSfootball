
package eu.dataaccess.footballpool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullTeamInfoResult" type="{http://footballpool.dataaccess.eu}tFullTeamInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fullTeamInfoResult"
})
@XmlRootElement(name = "FullTeamInfoResponse")
public class FullTeamInfoResponse {

    @XmlElement(name = "FullTeamInfoResult", required = true)
    protected TFullTeamInfo fullTeamInfoResult;

    /**
     * Obtiene el valor de la propiedad fullTeamInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TFullTeamInfo }
     *     
     */
    public TFullTeamInfo getFullTeamInfoResult() {
        return fullTeamInfoResult;
    }

    /**
     * Define el valor de la propiedad fullTeamInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TFullTeamInfo }
     *     
     */
    public void setFullTeamInfoResult(TFullTeamInfo value) {
        this.fullTeamInfoResult = value;
    }

}
