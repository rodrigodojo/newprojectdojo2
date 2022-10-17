package com.dojo.newprojectdojo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Recource not found. Id : " + id);
    }

}
