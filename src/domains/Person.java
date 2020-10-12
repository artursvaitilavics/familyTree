package domains;


import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "lifeDates")
    private String lifeDates;

    @Column(name = "fatherId")
    private Integer fatherId;

    @Column(name = "motherId")
    private Integer motherId;

    @Column(name = "siblingId")
    private Integer siblingId;

    public Person() {
    }

    public Person(String firstName, String lastName, String lifeDates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lifeDates = lifeDates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLifeDates() {
        return lifeDates;
    }

    public void setLifeDates(String lifeDates) {
        this.lifeDates = lifeDates;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getMotherId() {
        return motherId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public Integer getSiblingId() {
        return siblingId;
    }

    public void setSiblingId(Integer siblingId) {
        this.siblingId = siblingId;
    }
}
