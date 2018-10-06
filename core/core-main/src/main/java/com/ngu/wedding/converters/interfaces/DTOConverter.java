package com.ngu.wedding.converters.interfaces;

/**
 * @author bkenn
 * @param <T>
 * @param <F>
 */
public interface DTOConverter<T, F>
{
	/**
	 * Convert to the DTO from DOA domain
	 */
	T covertToDTO(F from);

	/**
	 * Convert to the DOA domain from DTO
	 */
	F covertFromDTO(T to);
}
