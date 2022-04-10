package lt.netcode.poll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.netcode.poll.entities.Questions;
import lt.netcode.poll.repositories.QuestionsRepository;

@Service
public class QuestionsServices {
	
	@Autowired
	QuestionsRepository questionsRepository;
	
	public List<Questions> geQuestions(){
		return questionsRepository.findAll();	
	}
	
	public Questions saveQuestions(Questions questions) {
		return questionsRepository.save(questions);
	}

}
