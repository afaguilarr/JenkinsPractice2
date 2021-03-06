package com.praxis.topics.repository;

import com.praxis.topics.model.Collaborator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollaboratorRepository extends MongoRepository<Collaborator, String> {
    List<Collaborator> findAll();
    Collaborator findCollaboratorById(String id);

}