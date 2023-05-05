package com.devsuperior.dslearnbds.resources.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthCustomError implements Serializable {
   	private static final long serialVersionUID = 1L;
    private String error;
     
    @JsonProperty("error_description")
    private String ErrorDescripton;
	
    
   public OAuthCustomError() {
    	 
   }


	public OAuthCustomError(String error, String errorDescripton) {
		super();
		this.error = error;
		ErrorDescripton = errorDescripton;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getErrorDescripton() {
		return ErrorDescripton;
	}


	public void setErrorDescripton(String errorDescripton) {
		ErrorDescripton = errorDescripton;
	}
     
     
}
