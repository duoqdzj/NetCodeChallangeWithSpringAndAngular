package lt.netcode.poll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import lt.netcode.poll.entities.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Integer>{}
