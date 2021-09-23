@Entity(name = "Student")
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "ID")
    private Long studentId;
    @Column(name = "FNAME", nullable = false)
    private String firstName;
    @Column(name = "LNAME", unique = true, length = 25)
    private String lastName;
    @Column(name = "CONTACT_NO", length = 15)
    private String contactNo;
    // Setters, getters and toString() omitted
}