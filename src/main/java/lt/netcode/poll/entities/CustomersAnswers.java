package lt.netcode.poll.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "customers_answers")

public class CustomersAnswers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@Column 
	private String radio4;
	
	@Column 
	private String radio5;
	
	@Column 
	private String radio6;
	
	public CustomersAnswers() {

	}

	public CustomersAnswers(Integer id, String customer_id, String radio4, String radio5, String radio6) {
		this.id = id;
		this.customer = customer;
		this.radio4 = radio4;
		this.radio5 = radio5;
		this.radio6 = radio6;
	}
	
	public CustomersAnswers(Customer customer, String radio4, String radio5, String radio6) {
		this.customer = customer;
		this.radio4 = radio4;
		this.radio5 = radio5;
		this.radio6 = radio6;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getRadio4() {
		return radio4;
	}

	public void setRadio4(String radio4) {
		this.radio4 = radio4;
	}

	public String getRadio5() {
		return radio5;
	}

	public void setRadio5(String radio5) {
		this.radio5 = radio5;
	}

	public String getRadio6() {
		return radio6;
	}

	public void setRadio6(String radio6) {
		this.radio6 = radio6;
	}
	
	
	

}
