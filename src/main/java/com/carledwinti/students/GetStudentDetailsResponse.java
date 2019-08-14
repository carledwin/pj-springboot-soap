//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.08.14 às 10:06:29 AM BRT 
//


package com.carledwinti.students;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentDetails" type="{http://carledwinti.com/students}StudentDetails"/>
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
    "studentDetails"
})
@XmlRootElement(name = "GetStudentDetailsResponse")
public class GetStudentDetailsResponse {

    @XmlElement(name = "StudentDetails", required = true)
    protected StudentDetails studentDetails;

    /**
     * Obtém o valor da propriedade studentDetails.
     * 
     * @return
     *     possible object is
     *     {@link StudentDetails }
     *     
     */
    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    /**
     * Define o valor da propriedade studentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDetails }
     *     
     */
    public void setStudentDetails(StudentDetails value) {
        this.studentDetails = value;
    }

}
