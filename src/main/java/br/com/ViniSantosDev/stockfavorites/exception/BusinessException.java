package br.com.ViniSantosDev.stockfavorites.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -7507642233804283142L;

	public BusinessException(String mensagem) {
		super(mensagem);
	}

	public BusinessException(String mensagem, Exception exception) {
		super(mensagem, exception);
	}

}
