package lt.netcode.poll.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions_answers")
public class QuestionsAnswers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="question_id")
	private Questions questions;
	
	@Column 
	private String inputRadio;
	
	public QuestionsAnswers() {
	}
	
	public QuestionsAnswers(String inputRadio) {
		this.inputRadio = inputRadio;
	}

	public QuestionsAnswers(lt.netcode.poll.entities.Questions questions, String inputRadio) {
		questions = questions;
		this.inputRadio = inputRadio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		questions = questions;
	}

	public String getInputRadio() {
		return inputRadio;
	}

	public void setInputRadio(String inputRadio) {
		this.inputRadio = inputRadio;
	}
	
	
	
	
}
