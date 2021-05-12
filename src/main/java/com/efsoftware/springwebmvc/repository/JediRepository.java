package com.efsoftware.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.efsoftware.springwebmvc.model.Jedi;

@Repository
public class JediRepository {
	private List<Jedi> jedi;
	
	public JediRepository() {
		jedi = new ArrayList<Jedi>();
		jedi.add(new Jedi("jedi","um"));      
	}

	public List<Jedi> getAllJedi(){   
		return this.jedi;    
	  }    
	  
	  public void add(Jedi jedi) {
		  this.jedi.add(jedi);  
	  }
}
