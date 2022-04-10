package lt.netcode.poll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.netcode.poll.entities.QuestionsAnswers;

public interface QuestionsAnswersRepository extends JpaRepository<QuestionsAnswers, Integer>{}
