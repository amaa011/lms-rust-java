
package com.telebilling.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telebilling.service.client package. 
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

    private final static QName _PayTELEBillAmountResponse_QNAME = new QName("http://service.telebilling.com/", "payTELEBillAmountResponse");
    private final static QName _PayFixedLineBillProcess_QNAME = new QName("http://service.telebilling.com/", "payFixedLineBillProcess");
    private final static QName _PayFixedLineBillProcessResponse_QNAME = new QName("http://service.telebilling.com/", "payFixedLineBillProcessResponse");
    private final static QName _PayTELEBillAmount_QNAME = new QName("http://service.telebilling.com/", "payTELEBillAmount");
    private final static QName _PaymobileBillProcessResponse_QNAME = new QName("http://service.telebilling.com/", "paymobileBillProcessResponse");
    private final static QName _PaymobileBillProcess_QNAME = new QName("http://service.telebilling.com/", "paymobileBillProcess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telebilling.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymobileBillProcess }
     * 
     */
    public PaymobileBillProcess createPaymobileBillProcess() {
        return new PaymobileBillProcess();
    }

    /**
     * Create an instance of {@link PayTELEBillAmount }
     * 
     */
    public PayTELEBillAmount createPayTELEBillAmount() {
        return new PayTELEBillAmount();
    }

    /**
     * Create an instance of {@link PaymobileBillProcessResponse }
     * 
     */
    public PaymobileBillProcessResponse createPaymobileBillProcessResponse() {
        return new PaymobileBillProcessResponse();
    }

    /**
     * Create an instance of {@link PayTELEBillAmountResponse }
     * 
     */
    public PayTELEBillAmountResponse createPayTELEBillAmountResponse() {
        return new PayTELEBillAmountResponse();
    }

    /**
     * Create an instance of {@link PayFixedLineBillProcess }
     * 
     */
    public PayFixedLineBillProcess createPayFixedLineBillProcess() {
        return new PayFixedLineBillProcess();
    }

    /**
     * Create an instance of {@link PayFixedLineBillProcessResponse }
     * 
     */
    public PayFixedLineBillProcessResponse createPayFixedLineBillProcessResponse() {
        return new PayFixedLineBillProcessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTELEBillAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.telebilling.com/", name = "payTELEBillAmountResponse")
    public JAXBElement<PayTELEBillAmountResponse> createPayTELEBillAmountResponse(PayTELEBillAmountResponse value) {
        return new JAXBElement<PayTELEBillAmountResponse>(_PayTELEBillAmountResponse_QNAME, PayTELEBillAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayFixedLineBillProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.telebilling.com/", name = "payFixedLineBillProcess")
    public JAXBElement<PayFixedLineBillProcess> createPayFixedLineBillProcess(PayFixedLineBillProcess value) {
        return new JAXBElement<PayFixedLineBillProcess>(_PayFixedLineBillProcess_QNAME, PayFixedLineBillProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayFixedLineBillProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.telebilling.com/", name = "payFixedLineBillProcessResponse")
    public JAXBElement<PayFixedLineBillProcessResponse> createPayFixedLineBillProcessResponse(PayFixedLineBillProcessResponse value) {
        return new JAXBElement<PayFixedLineBillProcessResponse>(_PayFixedLineBillProcessResponse_QNAME, PayFixedLineBillProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTELEBillAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.telebilling.com/", name = "payTELEBillAmount")
    public JAXBElement<PayTELEBillAmount> createPayTELEBillAmount(PayTELEBillAmount value) {
        return new JAXBElement<PayTELEBillAmount>(_PayTELEBillAmount_QNAME, PayTELEBillAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymobileBillProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.telebilling.com/", name = "paymobileBillProcessResponse")
    public JAXBElement<PaymobileBillProcessResponse> createPaymobileBillProcessResponse(PaymobileBillProcessResponse value) {
        return new JAXBElement<PaymobileBillProcessResponse>(_PaymobileBillProcessResponse_QNAME, PaymobileBillProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymobileBillProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.telebilling.com/", name = "paymobileBillProcess")
    public JAXBElement<PaymobileBillProcess> createPaymobileBillProcess(PaymobileBillProcess value) {
        return new JAXBElement<PaymobileBillProcess>(_PaymobileBillProcess_QNAME, PaymobileBillProcess.class, null, value);
    }

}
