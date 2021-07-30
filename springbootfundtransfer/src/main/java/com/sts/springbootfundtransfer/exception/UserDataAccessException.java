package com.sts.springbootfundtransfer.exception;

public class UserDataAccessException extends Exception{
public static final long serialVersionUID=-4798965926484615958L;

public UserDataAccessException(String errorMessage){

super(errorMessage);
}

}