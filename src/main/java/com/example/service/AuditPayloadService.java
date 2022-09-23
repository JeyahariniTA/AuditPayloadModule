package com.example.service;

import java.util.Date;
import java.util.List;

import com.example.model.AuditPayload;

public interface AuditPayloadService {

	public List<AuditPayload> listAuditPayloads();

	public AuditPayload fetchAuditPayloadById(int id);

	public AuditPayload addAuditPayload(AuditPayload auditPayload);

	public AuditPayload updateAuditPayload(AuditPayload auditPayload);

	public String deleteAuditPayload(int id);

	public List<AuditPayload> getByPatientIdAndDate(int patientId, Date startDate, Date endDate);

	public List<AuditPayload> getByUserNameAndDate(String userName, Date startDate, Date endDate);

	public List<AuditPayload> getByEntityTypeAndDate(String entityType, Date startDate, Date endDate);

	public List<AuditPayload> fetchAuditPayloadByEntityId(int entityId);
}
