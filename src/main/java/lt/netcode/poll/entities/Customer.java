package lt.netcode.poll.entities;

import java.util.List;

import javax.persistence.*;





@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column 
	private String phone;
	
	@Column 
	private String email;
	
	@Column 
	private String radio1;
	
	@Column 
	private String radio2;
	
	@Column 
	private String radio3;
	
	@OneToMany( mappedBy = "customer" )
	private List<CustomersAnswers> CustomersAnswers;
	
	
	public List<CustomersAnswers> getCustomersAnswers() {
		return CustomersAnswers;
	}

	public void setCustomersAnswers(List<CustomersAnswers> CustomersAnswers) {
		this.CustomersAnswers = CustomersAnswers;
	}

	public Customer() {
		super();
	}

	public Customer(String name, String surname, String phone, String email, String radio1, String radio2, String radio3) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.radio1 = radio1;
		this.radio2 = radio2;
		this.radio3 = radio3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRadio1() {
		return radio1;
	}

	public void setRadio1(String radio1) {
		this.radio1 = radio1;
	}

	public String getRadio2() {
		return radio2;
	}

	public void setRadio2(String radio2) {
		this.radio2 = radio2;
	}

	public String getRadio3() {
		return radio3;
	}

	public void setRadio3(String radio3) {
		this.radio3 = radio3;
	}

	
}
