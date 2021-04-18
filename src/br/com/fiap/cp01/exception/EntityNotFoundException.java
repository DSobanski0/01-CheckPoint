package br.com.fiap.cp01.exception;

public class EntityNotFoundException extends Exception {

	public EntityNotFoundException(String msg) {
		super(msg);
	}

	public EntityNotFoundException() {
		super("Entidade n�o foi encontrada");
	}
}