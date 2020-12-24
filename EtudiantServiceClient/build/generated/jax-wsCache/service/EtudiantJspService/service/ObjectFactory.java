
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _Etudiant_QNAME = new QName("http://service/", "etudiant");
    private final static QName _GetEtudiant_QNAME = new QName("http://service/", "get_etudiant");
    private final static QName _GetEtudiantResponse_QNAME = new QName("http://service/", "get_etudiantResponse");
    private final static QName _GetEtudiantListByNote_QNAME = new QName("http://service/", "get_etudiant_list_by_note");
    private final static QName _GetEtudiantListByNoteResponse_QNAME = new QName("http://service/", "get_etudiant_list_by_noteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link GetEtudiant }
     * 
     */
    public GetEtudiant createGetEtudiant() {
        return new GetEtudiant();
    }

    /**
     * Create an instance of {@link GetEtudiantResponse }
     * 
     */
    public GetEtudiantResponse createGetEtudiantResponse() {
        return new GetEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantListByNote }
     * 
     */
    public GetEtudiantListByNote createGetEtudiantListByNote() {
        return new GetEtudiantListByNote();
    }

    /**
     * Create an instance of {@link GetEtudiantListByNoteResponse }
     * 
     */
    public GetEtudiantListByNoteResponse createGetEtudiantListByNoteResponse() {
        return new GetEtudiantListByNoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "etudiant")
    public JAXBElement<Etudiant> createEtudiant(Etudiant value) {
        return new JAXBElement<Etudiant>(_Etudiant_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEtudiant }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "get_etudiant")
    public JAXBElement<GetEtudiant> createGetEtudiant(GetEtudiant value) {
        return new JAXBElement<GetEtudiant>(_GetEtudiant_QNAME, GetEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEtudiantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "get_etudiantResponse")
    public JAXBElement<GetEtudiantResponse> createGetEtudiantResponse(GetEtudiantResponse value) {
        return new JAXBElement<GetEtudiantResponse>(_GetEtudiantResponse_QNAME, GetEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantListByNote }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEtudiantListByNote }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "get_etudiant_list_by_note")
    public JAXBElement<GetEtudiantListByNote> createGetEtudiantListByNote(GetEtudiantListByNote value) {
        return new JAXBElement<GetEtudiantListByNote>(_GetEtudiantListByNote_QNAME, GetEtudiantListByNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantListByNoteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEtudiantListByNoteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "get_etudiant_list_by_noteResponse")
    public JAXBElement<GetEtudiantListByNoteResponse> createGetEtudiantListByNoteResponse(GetEtudiantListByNoteResponse value) {
        return new JAXBElement<GetEtudiantListByNoteResponse>(_GetEtudiantListByNoteResponse_QNAME, GetEtudiantListByNoteResponse.class, null, value);
    }

}
