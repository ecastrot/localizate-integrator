package com.localizate.integration.util;

/**
 * Exception general para manejo de errores inesperados en la aplicaci�n..
 * @author ecastrot.
 */
public class LocalizateRuntimeException extends RuntimeException {

  /** Serial id. */
  private static final long serialVersionUID = -6704827152005367265L;

  /** Constructor de la excepci�n. */
  public LocalizateRuntimeException() {
    super();
  }

  /**
   * Crea una instancia de la excepci�n con un mensaje especifico.
   * @param internalMessage Mensaje asociado a la excepci�n.
   */
  public LocalizateRuntimeException(String internalMessage) {
    super(internalMessage);
  }

  /**
   * Crea una instancia de la excepci�n con un mensaje especifico y la causa de origen de la excepci�n.
   * @param internalMessage Mensaje asociado a la excepci�n.
   * @param cause causa del error.
   */
  public LocalizateRuntimeException(String internalMessage, Throwable cause) {
    super(internalMessage, cause);
  }
}
