package com.challenger.alura.adopet.services;


import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class CriptografiaService {

	String salt = BCrypt.gensalt(12);

	public String gerarHash(String password) {
		return BCrypt.hashpw(password, salt);
	}

	public Boolean checkHash(String password,String passwordHashed){
		if (BCrypt.checkpw(password, passwordHashed)){
			return true;
		}
		else{
			return false;
		}
	}


}
