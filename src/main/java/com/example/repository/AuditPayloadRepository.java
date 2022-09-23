package com.example.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.AuditPayload;

@Repository
public interface AuditPayloadRepository extends MongoRepository<AuditPayload, Integer> {

	public boolean existsByEntityId(int entityId);

	public List<AuditPayload> findByEntityId(int entityId);

//	@Query("{'logDate': {$gt: ?1, $lt: ?2}, 'patientId' : ?0}")
	public List<AuditPayload> findByPatientIdAndLogDateBetween(int patientId, Date startDate, Date endDate);

	public List<AuditPayload> findByUserNameAndLogDateBetween(String userName, Date startDate, Date endDate);

	public List<AuditPayload> findByEntityTypeAndLogDateBetween(String userName, Date startDate, Date endDate);

}
