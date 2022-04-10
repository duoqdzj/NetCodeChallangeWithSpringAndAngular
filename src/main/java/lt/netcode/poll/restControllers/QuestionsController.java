package lt.netcode.poll.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.netcode.poll.entities.Questions;
import lt.netcode.poll.services.QuestionsServices;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

	@Autowired
	QuestionsServices questionsServices;
	
	@CrossOrigin
	@GetMapping("/")
	public List<Questions> index(){
		return questionsServices.geQuestions();
	}
	
	@CrossOrigin
	@PostMapping("/")
	public Questions add(Questions s) {
		return questionsServices.saveQuestions(s);
	}
	

}
