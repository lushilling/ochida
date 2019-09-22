package com.ochida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ochida.entity.ClassTimetable;

@Repository
public interface ClassTimetableRepository extends MongoRepository<ClassTimetable, Long>{

}
