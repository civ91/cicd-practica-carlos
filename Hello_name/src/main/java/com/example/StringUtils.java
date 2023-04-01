package com.example;

/**
 * Clase utilitaria con métodos estáticos para operaciones comunes de cadenas.
 */
public class StringUtils {
    
    /**
     * Retorna un saludo personalizado para el nombre especificado.
     * @param name el nombre a saludar
     * @return el saludo personalizado para el nombre especificado
     */
    public static String saludar(String name) {
        return "Hola " + name + "!";
    }
    
    /**
     * Determina si la cadena especificada es nula o está vacía.
     * @param str la cadena a evaluar
     * @return verdadero si la cadena es nula o está vacía, falso en caso contrario
     */
    public static boolean esVacio(String str) {
        return str == null || str.trim().isEmpty();
    }
    
    /**
     * Elimina los espacios en blanco de la cadena especificada.
     * @param str la cadena a procesar
     * @return la cadena sin espacios en blanco
     */
    public static String eliminarEspacios(String str) {
        return str;
        // Implementación de eliminarEspacios
    }
    
    /**
     * Revierte el orden de los caracteres en la cadena especificada.
     * @param str la cadena a procesar
     * @return la cadena con los caracteres en orden inverso
     */
    public static String revertirCadena(String str) {
        return str;
        // Implementación de revertirCadena
    }
    
    /**
     * Concatena las cadenas especificadas en una sola cadena.
     * @param parts las cadenas a concatenar
     * @return la cadena resultante de la concatenación
     */
    public static String concatenarCadenas(String... parts) {
        return null;
        // Implementación de concatenarCadenas
    }
}
