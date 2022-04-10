package lt.netcode.poll.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.netcode.poll.entities.QuestionsAnswers;
import lt.netcode.poll.services.QuestionsAnswersService;

@RestController
@RequestMapping("/questions_answers")
public class QuestionsAnswersControllers {
	
	@Autowired
	QuestionsAnswersService questionsAnswersService;
	
	@CrossOrigin
	@GetMapping("/")
	public List<QuestionsAnswers> index(){
		return questionsAnswersService.geQuestionsAnswerss();
	}

	@CrossOrigin
	@PostMapping("/")
	public QuestionsAnswers add(QuestionsAnswers s)
	{
		return questionsAnswersService.saveQuestionsAnswers(s);
	}
	
}
