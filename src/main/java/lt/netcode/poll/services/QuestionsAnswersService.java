package lt.netcode.poll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.netcode.poll.entities.Customer;
import lt.netcode.poll.entities.QuestionsAnswers;
import lt.netcode.poll.repositories.QuestionsAnswersRepository;

@Service
public class QuestionsAnswersService {
	
	@Autowired
	QuestionsAnswersRepository questionsAnswersRepository;
	
	public List<QuestionsAnswers> geQuestionsAnswerss(){
		return questionsAnswersRepository.findAll();	
	}
	
	public QuestionsAnswers saveQuestionsAnswers(QuestionsAnswers questionsAnswers) {
		return questionsAnswersRepository.save(questionsAnswers);
	}

}
