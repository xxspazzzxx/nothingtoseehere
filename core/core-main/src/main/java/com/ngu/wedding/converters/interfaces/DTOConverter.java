package com.ngu.wedding.converters.interfaces;

public interface DTOConverter<T, F>
{
	T convert(F from);
}
