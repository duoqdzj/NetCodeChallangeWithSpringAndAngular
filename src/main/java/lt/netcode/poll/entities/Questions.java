package lt.netcode.poll.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="questions")
public class Questions {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column
		private String query;
		
		@Column
		private String radio1;
		
		@Column
		private String radio2;
		
		@Column
		private String radio3;
		
		@Column
		private String radio4;
		

		
		public Questions() {
		}

		public Questions(String query, String radio1, String radio2, String radio3, String radio4) {
			this.query = query;
			this.radio1 = radio1;
			this.radio2 = radio2;
			this.radio3 = radio3;
			this.radio4 = radio4;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getQuery() {
			return query;
		}

		public void setQuery(String query) {
			this.query = query;
			
			
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

		public String getRadio4() {
			return radio4;
		}

		public void setRadio4(String radio4) {
			this.radio4 = radio4;
		}



}
