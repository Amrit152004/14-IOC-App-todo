package in.kumar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kumar.Entity.TaskEntity;
import in.kumar.repository.TaskRepository;
import jakarta.transaction.Transactional;

@Service
public class TaskService {
	@Autowired
	private TaskRepository tr;
	
	public void saveTask(TaskEntity e) {
		tr.save(e);
		
	}

	public List<TaskEntity> findByEmail(String email) {
		// TODO Auto-generated method stub
		return tr.findByEmail(email);
	}

	public void deleteById(Integer tId) {
		// TODO Auto-generated method stub
		tr.deleteById(tId);
		
	}

	public void updateById(Integer tId) {
		// TODO Auto-generated method stub
		tr.updateById(tId);
		
	}

	public Optional<TaskEntity> findById(Integer tId) {
		Optional<TaskEntity> byId = tr.findById(tId);
		return byId;
		
	}
@Transactional
	public void updateByIdData(Integer tId, String tdate, String ttime) {
		// TODO Auto-generated method stub
		tr.updateByIdData(tId,tdate,ttime);
		
	}



}
