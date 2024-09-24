package com.Aqeeb.JobApp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aqeeb.JobApp2.model.JobPost;
import com.Aqeeb.JobApp2.repo.JobRepo;

@Service
public class JobService {
		
		@Autowired
		private JobRepo repo;
		
		public void addJob(JobPost jobPost) {
			
			repo.addJobPost(jobPost);
			
		}
		
		public List<JobPost> getAllJobs(){
			return repo.returnAllJobPosts();
		}

	
}