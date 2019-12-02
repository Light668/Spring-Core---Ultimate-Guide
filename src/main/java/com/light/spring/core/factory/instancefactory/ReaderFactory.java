package com.light.spring.core.factory.instancefactory;

import java.util.Map;

public class ReaderFactory {

	private Map<ReaderType, Reader> readers = null;

	public Map<ReaderType, Reader> getReaders() {
		return readers;
	}

	public void setReaders(Map<ReaderType, Reader> readers) {
		this.readers = readers;
	}

	public Reader createReader(ReaderType readerType) {
		if (readers.containsKey(readerType)) {
			return readers.get(readerType);
		}
		throw new IllegalArgumentException("Invalid reader type!");
	}
}
