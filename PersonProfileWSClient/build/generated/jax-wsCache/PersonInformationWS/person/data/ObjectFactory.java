
package person.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the person.data package. 
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

    private final static QName _InsertPersonProfileResponse_QNAME = new QName("http://data.person/", "insertPersonProfileResponse");
    private final static QName _SelectAllPersonInformation_QNAME = new QName("http://data.person/", "selectAllPersonInformation");
    private final static QName _GetAge_QNAME = new QName("http://data.person/", "getAge");
    private final static QName _GetAgeResponse_QNAME = new QName("http://data.person/", "getAgeResponse");
    private final static QName _SelectAllPersonInformationResponse_QNAME = new QName("http://data.person/", "selectAllPersonInformationResponse");
    private final static QName _InsertPersonProfile_QNAME = new QName("http://data.person/", "insertPersonProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: person.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAge }
     * 
     */
    public GetAge createGetAge() {
        return new GetAge();
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

    /**
     * Create an instance of {@link SelectAllPersonInformation }
     * 
     */
    public SelectAllPersonInformation createSelectAllPersonInformation() {
        return new SelectAllPersonInformation();
    }

    /**
     * Create an instance of {@link InsertPersonProfileResponse }
     * 
     */
    public InsertPersonProfileResponse createInsertPersonProfileResponse() {
        return new InsertPersonProfileResponse();
    }

    /**
     * Create an instance of {@link InsertPersonProfile }
     * 
     */
    public InsertPersonProfile createInsertPersonProfile() {
        return new InsertPersonProfile();
    }

    /**
     * Create an instance of {@link SelectAllPersonInformationResponse }
     * 
     */
    public SelectAllPersonInformationResponse createSelectAllPersonInformationResponse() {
        return new SelectAllPersonInformationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "insertPersonProfileResponse")
    public JAXBElement<InsertPersonProfileResponse> createInsertPersonProfileResponse(InsertPersonProfileResponse value) {
        return new JAXBElement<InsertPersonProfileResponse>(_InsertPersonProfileResponse_QNAME, InsertPersonProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllPersonInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectAllPersonInformation")
    public JAXBElement<SelectAllPersonInformation> createSelectAllPersonInformation(SelectAllPersonInformation value) {
        return new JAXBElement<SelectAllPersonInformation>(_SelectAllPersonInformation_QNAME, SelectAllPersonInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "getAge")
    public JAXBElement<GetAge> createGetAge(GetAge value) {
        return new JAXBElement<GetAge>(_GetAge_QNAME, GetAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "getAgeResponse")
    public JAXBElement<GetAgeResponse> createGetAgeResponse(GetAgeResponse value) {
        return new JAXBElement<GetAgeResponse>(_GetAgeResponse_QNAME, GetAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllPersonInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectAllPersonInformationResponse")
    public JAXBElement<SelectAllPersonInformationResponse> createSelectAllPersonInformationResponse(SelectAllPersonInformationResponse value) {
        return new JAXBElement<SelectAllPersonInformationResponse>(_SelectAllPersonInformationResponse_QNAME, SelectAllPersonInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "insertPersonProfile")
    public JAXBElement<InsertPersonProfile> createInsertPersonProfile(InsertPersonProfile value) {
        return new JAXBElement<InsertPersonProfile>(_InsertPersonProfile_QNAME, InsertPersonProfile.class, null, value);
    }

}
