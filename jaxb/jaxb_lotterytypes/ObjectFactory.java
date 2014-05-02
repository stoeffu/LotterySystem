//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.02 at 06:47:04 PM CEST 
//


package jaxb_lotterytypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb_lotterytypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LotteryTicket_QNAME = new QName("http://www.ti.bfh.ch/euromillions/", "lottery_ticket");
    private final static QName _Validity_QNAME = new QName("http://www.ti.bfh.ch/euromillions/", "validity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb_lotterytypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Plays }
     * 
     */
    public Plays createPlays() {
        return new Plays();
    }

    /**
     * Create an instance of {@link Plays.Play }
     * 
     */
    public Plays.Play createPlaysPlay() {
        return new Plays.Play();
    }

    /**
     * Create an instance of {@link LotteryTicketType }
     * 
     */
    public LotteryTicketType createLotteryTicketType() {
        return new LotteryTicketType();
    }

    /**
     * Create an instance of {@link LotteryTickets }
     * 
     */
    public LotteryTickets createLotteryTickets() {
        return new LotteryTickets();
    }

    /**
     * Create an instance of {@link Plays.Play.Numbers }
     * 
     */
    public Plays.Play.Numbers createPlaysPlayNumbers() {
        return new Plays.Play.Numbers();
    }

    /**
     * Create an instance of {@link Plays.Play.StarNumbers }
     * 
     */
    public Plays.Play.StarNumbers createPlaysPlayStarNumbers() {
        return new Plays.Play.StarNumbers();
    }

    /**
     * Create an instance of {@link LotteryTicketType.SuperStarNumbers }
     * 
     */
    public LotteryTicketType.SuperStarNumbers createLotteryTicketTypeSuperStarNumbers() {
        return new LotteryTicketType.SuperStarNumbers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LotteryTicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ti.bfh.ch/euromillions/", name = "lottery_ticket")
    public JAXBElement<LotteryTicketType> createLotteryTicket(LotteryTicketType value) {
        return new JAXBElement<LotteryTicketType>(_LotteryTicket_QNAME, LotteryTicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ti.bfh.ch/euromillions/", name = "validity")
    public JAXBElement<Integer> createValidity(Integer value) {
        return new JAXBElement<Integer>(_Validity_QNAME, Integer.class, null, value);
    }

}
